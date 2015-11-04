package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Enemy;
import com.company.graphics.ImageAlbum;


public class EasyEnemy extends Enemy {
    private static final int HEALTH = 1;
    public EasyEnemy(int x, int y) {
        super(x, y, HEALTH, ImageAlbum.EasyEnemy.getPath());
    }
}
