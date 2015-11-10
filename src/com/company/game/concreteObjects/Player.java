package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Bonus;
import com.company.game.AbstractObjects.GameObject;
import com.company.game.Game;
import com.company.gameObjectsInterfaces.Firable;
import com.company.graphics.Assets;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;
import com.company.screeStates.GameState;

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

    public Player(int x, int y, String name, int speed) {
        super(x, y, Assets.player, speed);
        this.numberOfLives = INITILAL_NUMBER_OF_LIVES;
        this.playerName = name;
        this.score = 0;
    }

    @Override
    public void update() {

        this.getColliderBox().setBounds(this.getX(), this.getY(),
                this.getObjectIcon().getWidth(), this.getObjectIcon().getHeight());

        if (isMovingRight && this.getX() + this.getSpeed() <= 730) {
            this.setX(this.getX() + this.getSpeed());
        }
        if (isMovingLeft && this.getX() + this.getSpeed() >= 0) {
            this.setX(this.getX() - this.getSpeed());
        }
        if (isMovingDown && this.getY() + this.getSpeed() < 520) {
            this.setY(this.getY() + this.getSpeed());
        }
        if (isMovingUp && this.getY() - this.getSpeed() >= 0) {
            this.setY(this.getY() - this.getSpeed());
        }

        if (isFiring) {
            GameState.bulletsList.add(new Bullet(this.getX() + 16, this.getY()));
            isFiring =false;
        }

    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }
    @Override
    public void display(Graphics g) {

        g.drawImage(this.getObjectIcon(), this.getX(), this.getY(), null);

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
        return new Bullet(this.getX(), this.getY());
    }

}
