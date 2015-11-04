package com.company.game;

import com.company.game.concreteObjects.Bullet;
import com.company.game.AbstractObjects.Enemy;
import com.company.game.concreteObjects.Player;

import java.util.List;


public class Game implements Runnable {
    private Player player;
    private List<Enemy> enemiesList;
    private List<Bullet> bulletsList;

    public void displayFrame(){
        //Display the current frame using the display frame;
    }
    public void update(){
        //TODO: Implement collision detection
        //TODO: Listen for input from the user
        //TODO: update the states of the objects;
    }
    @Override
    public void run() {

    }
}
