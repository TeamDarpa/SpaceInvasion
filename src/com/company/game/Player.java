package com.company.game;

import com.company.gameObjectsInterfaces.Firable;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;

import java.awt.*;
import java.awt.font.ImageGraphicAttribute;
import java.awt.image.BufferedImage;

/**
 * Created by stil2_000 on 2.11.2015 ã..
 */
public class Player extends GameObject implements Firable {


    private final int INITILAL_NUMBER_OF_LIVES = 3;
    private int numberOfLives;
    private String playerName;
    private int score;
    //TODO: map the path with the one to the image

    public Player(int x, int y, String name) {
        super(x, y, ImageAlbum.Enemy.getPath());
        this.numberOfLives = INITILAL_NUMBER_OF_LIVES;
        this.playerName = name;
        this.score = 0;
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



    @Override
    public void fire() {

    }
}
