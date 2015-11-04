package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Enemy;
import com.company.graphics.ImageAlbum;


public class EasyEnemy extends Enemy {

    private static final int HEALTH = 1;
    private static final int POINTS_FOR_PLAYER = 5;

    public EasyEnemy(int x, int y) {
        super(x, y, HEALTH, ImageAlbum.EasyEnemy.getPath(), POINTS_FOR_PLAYER);
    }
}
