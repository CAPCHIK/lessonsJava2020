package ru.capchik.fun.game2048;

import java.util.Arrays;

public class LineHolder {
    private CellHolder[] cellsLine;

    public LineHolder(int size) {
        cellsLine = new CellHolder[size];
    }

    public void setHolder(int position, CellHolder holder) {
        cellsLine[position] = holder;
    }

    public boolean moveCellsLeft() {
        boolean moved = false;
        for (int i = 0; i < cellsLine.length - 1; i++) {
            moved |= workWithCell(i, 1);
        }
        return moved;
    }

    public boolean moveCellsRight() {
        boolean moved = false;
        for (int i = cellsLine.length - 1; i > 0; i--) {
            moved |= workWithCell(i, -1);
        }
        return moved;
    }

    public boolean isMoveAvailable() {
        for (int i =0; i < cellsLine.length - 1; i++) {

            CellHolder currentCell = cellsLine[i];
            if (currentCell.isEmpty()) {
                return true;
            }
            CellHolder nearCell = cellsLine[i + 1];
            if (!nearCell.isEmpty() && currentCell.getCell().getValue() == nearCell.getCell().getValue()) {
                return true;
            }
        }
        return false;
    }

    private boolean workWithCell(int cellIndex, int step) {
        CellHolder to = cellsLine[cellIndex];
        boolean moved = false;
        if (to.isEmpty()) { // move
            for (int i = cellIndex; i < cellsLine.length && i >= 0; i += step) {
                CellHolder from = cellsLine[i];
                if (!from.isEmpty()) {
                    to.setCell(from.popCell());
                    moved = true;
                    break;
                }
            }
        }
        if (!to.isEmpty()) {
            int toValue = to.getCell().getValue();
            for (int i = cellIndex + step; i < cellsLine.length && i >= 0; i += step) { // sum
                CellHolder from = cellsLine[i];
                if (!from.isEmpty())
                {
                    if (toValue == from.getCell().getValue())
                    {
                        to.setCell(from.popCell().multiply());
                        moved = true;
                    }
                    break;
                }
            }
        }
        return moved;
    }

    @Override
    public String toString() {
        return "LineHolder{" +
                "cellsLine=" + Arrays.toString(cellsLine) +
                '}';
    }
}
