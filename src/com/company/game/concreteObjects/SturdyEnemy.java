package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Enemy;
import com.company.graphics.ImageAlbum;

public class SturdyEnemy extends Enemy{
    private static final int HEALTH = 2;
    private static final int POINTS_FOR_PLAYER = 10;
    public SturdyEnemy(int x, int y) {
        super(x, y, HEALTH, ImageAlbum.SturdyEnemy.getPath(), POINTS_FOR_PLAYER);
    }
}
