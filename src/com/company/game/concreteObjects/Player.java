package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Bonus;
import com.company.game.AbstractObjects.GameObject;
import com.company.game.Game;
import com.company.gameObjectsInterfaces.Firable;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Player extends GameObject implements Firable {

    private final int INITILAL_NUMBER_OF_LIVES = 3;
    private int numberOfLives;
    private String playerName;
    private int score;
    private Bonus currentBonus;

    public static boolean
            isMovingLeft = false,
            isMovingRight = false,
            isMovingUp = false,
            isMovingDown = false,
            isFiring = false;

    //TODO: map the path with the one to the image

    public Player(int x, int y, String name, int speed) {
        super(x, y, ImageAlbum.Player.getPath(), speed);
        this.numberOfLives = INITILAL_NUMBER_OF_LIVES;
        this.playerName = name;
        this.score = 0;

    }

    public void update() {
        if (isMovingRight) {
            this.setX(this.getX() + this.getSpeed());
        } else if (isMovingLeft) {
            this.setX(this.getX() - this.getSpeed());
        } else if (isMovingDown) {
            this.setY(this.getY() + this.getSpeed());
        } else if(isMovingUp) {
            this.setY(this.getY() - this.getSpeed());
        }
        

    }

    public void render(Graphics g) {

        g.drawImage(this.getPlayerIcon(), this.getX(), this.getY(), null);
    }

    public int getScore() {
        return this.score;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getNumberOfLives() {
        return this.numberOfLives;
    }

    public void addToScore(int points) {
        this.score += points;
    }

    @Override
    public Bullet fire() {
        //TODO: fix the coordinates of the bullet starting position
        return new Bullet(this.getX(), this.getY(), ImageAlbum.Bullet.getPath());
    }
}
