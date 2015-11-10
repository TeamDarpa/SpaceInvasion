package com.company.game.AbstractObjects;

import com.company.game.concreteObjects.DoubleDamageBonus;
import com.company.graphics.Assets;
import com.company.helperClasses.RandomGenerator;
import com.company.screeStates.GameState;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class Enemy extends GameObject {

    private int health;
    private int pointsForPlayer;
    public static int passed = 0;

    public Enemy(int x, int y, int health, BufferedImage gameObjectIcon, int pointsForPlayer, int speedMultiplier) {
        super(x, y, gameObjectIcon, speedMultiplier);
        this.health = health;
        this.pointsForPlayer = pointsForPlayer;
    }

    public int getHealth(){
        return this.health;
    }

    public int getPointsForPlayer(){
        return this.pointsForPlayer;
    }

    @Override
    public void update() {
        this.getColliderBox().setBounds(this.getX(), this.getY(), this.getObjectIcon().getWidth(), this.getObjectIcon().getHeight());

        if (this.getHealth()>0) {
            this.getColliderBox().setBounds(this.getX(), this.getY(), this.getObjectIcon().getWidth(), this.getObjectIcon().getHeight());
            this.setY(this.getY() + this.getSpeed());

            //enemy is outside the window
            if (this.getY() > 650) {
                GameState.enemiesList.remove(this);
                passed++;
            }

            for (int i = 0; i < GameState.bulletsList.size(); i++) {
                if(this.collide(GameState.bulletsList.get(i).getColliderBox())) {
                    GameState.bulletsList.remove(i);
                    this.health--;
                }
            }

        }

        if(this.getHealth()==0) {
            GameState.enemiesList.remove(this);
            double chanceToGenerateBonus = RandomGenerator.getNextRandom();
            if (chanceToGenerateBonus > 0.7){
                GameState.bonusList.add(new DoubleDamageBonus(this.getX(), this.getY()));
            }
            GameState.score+=this.getPointsForPlayer();
        }
    }
}