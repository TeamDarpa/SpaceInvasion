package com.company.game.concreteObjects;

import com.company.display.Display;
import com.company.game.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Ivelin on 11/7/2015.
 */
public class KeyboardInput implements KeyListener {
    Game game;

    public KeyboardInput(Game game, Display display) {
        display.getCanvas().addKeyListener(this);
        this.game = game;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            Game.player.isMovingRight = true;

        } else if (key == KeyEvent.VK_LEFT) {
            Game.player.isMovingLeft = true;


        } else if (key == KeyEvent.VK_UP) {
            Game.player.isMovingUp = true;


        } else if (key == KeyEvent.VK_DOWN) {
            Game.player.isMovingDown = true;


        } else if (key == KeyEvent.VK_BACK_SPACE) {

        }
        if(Game.player.isFiring == false) {
            if (key == KeyEvent.VK_SPACE) {

                Game.player.isFiring = true;
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            Game.player.isMovingRight = false;

        } else if (key == KeyEvent.VK_LEFT) {
            Game.player.isMovingLeft = false;


        } else if (key == KeyEvent.VK_UP) {
            Game.player.isMovingUp = false;


        } else if (key == KeyEvent.VK_DOWN) {
            Game.player.isMovingDown = false;


        } else if (key == KeyEvent.VK_BACK_SPACE) {

        }
        if (key == KeyEvent.VK_SPACE) {
            Game.player.isFiring = false;
        }

    }
}
