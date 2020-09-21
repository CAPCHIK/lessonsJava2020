package ru.capchik.fun.game2048.players;

import ru.capchik.fun.game2048.Game2048Field;
import ru.capchik.fun.game2048.Game2048Player;

import java.util.Random;

public class Random2048Player extends Game2048Player {
    private Random random = new Random();
    public Random2048Player(Game2048Field game2048Field) {
        super(game2048Field);
    }

    @Override
    protected void step() {
        switch (random.nextInt(5)) {
            case 0:
                game2048Field.moveRight();
                break;
            case 1:
                game2048Field.moveDown();
                break;
            case 2:
                game2048Field.moveLeft();
                break;
            case 3:
                game2048Field.moveUp();
                break;
        }
    }
}
