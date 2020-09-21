package ru.capchik.fun.game2048.players;

import ru.capchik.fun.game2048.Game2048Field;
import ru.capchik.fun.game2048.Game2048Player;

import java.util.Scanner;

public class Console2048Player extends Game2048Player {
    private final Scanner scanner;

    public Console2048Player(Game2048Field game2048Field) {
        super(game2048Field);
        scanner = new Scanner(System.in);
    }

    @Override
    protected void step() {
        String line = scanner.nextLine();
        switch (line) {
            case "w":
                game2048Field.moveUp();
                break;
            case "d":
                game2048Field.moveRight();
                break;
            case "s":
                game2048Field.moveDown();
                break;
            case "a":
                game2048Field.moveLeft();
                break;
        }
    }
}
