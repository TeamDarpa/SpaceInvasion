package com.company.game.AbstractObjects;


public abstract class Enemy extends GameObject {

    private int health;
    private int pointsForPlayer;
    public Enemy(int x, int y, int health, String path, int pointsForPlayer) {
        super(x, y, path);
        this.health = health;
        this.pointsForPlayer = pointsForPlayer;
    }

    public int getHealth(){
        return this.health;
    }

    public int getPointsForPlaye(){
        return this.pointsForPlayer;
    }
}
