package com.company;

import com.company.game.Game;
import com.company.screeStates.MainMenuState;
import com.company.screeStates.State;

public class Main {
    public static void main(String[] args) {
      //  State state = new MainMenuState();
        Game game = new Game();

        game.start();
    }
}
