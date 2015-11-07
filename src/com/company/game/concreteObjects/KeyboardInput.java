package com.company.game.concreteObjects;

import com.company.game.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Ivelin on 11/7/2015.
 */
public class KeyboardInput extends KeyAdapter {
    Game game;

    public KeyboardInput(Game game) {
        this.game = game;
    }

    public void keyPressed(KeyEvent e) {
        game.keyPressed(e);

    }

    public void keyReleased(KeyEvent e) {
        game.keyReleased(e);
    }
}
