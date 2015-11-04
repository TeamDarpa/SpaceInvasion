package com.company.game.AbstractObjects;


public abstract class Enemy extends GameObject {

    private int health;

    public Enemy(int x, int y, int health, String path) {
        super(x, y, path);
        this.health = health;
    }
}
