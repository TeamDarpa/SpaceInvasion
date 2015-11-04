package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Bonus;
import com.company.game.AbstractObjects.GameObject;
import com.company.gameObjectsInterfaces.Firable;
import com.company.graphics.ImageAlbum;

/**
 * Created by stil2_000 on 2.11.2015 ã..
 */
public class Player extends GameObject implements Firable {


    private final int INITILAL_NUMBER_OF_LIVES = 3;
    private int numberOfLives;
    private String playerName;
    private int score;
    private Bonus currentBonus;
    //TODO: map the path with the one to the image

    public Player(int x, int y, String name) {
        super(x, y, ImageAlbum.Player.getPath());
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
