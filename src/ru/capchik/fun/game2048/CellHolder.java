package ru.capchik.fun.game2048;

public class CellHolder {
    private Cell cell;

    public boolean isEmpty() {
        return cell == null;
    }

    public Cell popCell() {
        Cell localCell = cell;
        cell = null;
        return localCell;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
    @Override
    public String toString() {
        if (cell == null) {
            return "    ";
        }
        int value = cell.getValue();
        if (value < 10) {
            return "  " + value + " ";
        } else if (value < 100) {
            return " " + value + " ";
        } else if (value < 1000) {
            return " " + value;
        } else return "" + value;
    }
}
