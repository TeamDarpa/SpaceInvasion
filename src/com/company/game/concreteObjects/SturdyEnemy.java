package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Enemy;
import com.company.graphics.Assets;
import com.company.graphics.ImageAlbum;
import com.company.screeStates.GameState;

import java.awt.*;

public class SturdyEnemy extends Enemy {

    private static final int HEALTH = 2;
    private static final int POINTS_FOR_PLAYER = 10;
    private static final int speedMultiplier = 4;
    public SturdyEnemy(int x, int y) {
        super(x, y, HEALTH, Assets.sturdyEnemy, POINTS_FOR_PLAYER, speedMultiplier);
    }

}
