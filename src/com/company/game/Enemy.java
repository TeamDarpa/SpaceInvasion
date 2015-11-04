package com.company.game;

import java.awt.image.BufferedImage;


public class Enemy extends GameObject {

    private int health;
    public Enemy(int x, int y, String path) {
        super(x, y, path);
    }
}
