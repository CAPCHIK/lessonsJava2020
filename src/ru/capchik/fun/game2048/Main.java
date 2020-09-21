package ru.capchik.fun.game2048;

import ru.capchik.fun.game2048.players.*;

public class Main {
    public static void main(String[] args) throws Exception {
        GameField gameField = new GameField(4);
        gameField.generateCell();
        Game2048Player player = new Random2048Player(gameField);
        player.startGame();
    }
}
