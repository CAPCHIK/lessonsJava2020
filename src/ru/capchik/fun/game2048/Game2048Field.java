package ru.capchik.fun.game2048;

public interface Game2048Field {
    int getSize();

    Cell[][] getFieldState();

    void moveRight();

    void moveDown();

    void moveLeft();

    void moveUp();

    boolean isMoveAvailable();
}
