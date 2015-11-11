package com.company.eventHandlers;

import com.company.graphics.Display;
import com.company.screeStates.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
    public MouseInput(Display display) {
        display.getCanvas().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        /**
         public Rectangle playButton = new Rectangle(350, 150, 100, 50);
        public Rectangle highScoreButton = new Rectangle(300, 250, 200, 50);
        public Rectangle quitButton = new Rectangle(350, 350, 100, 50);
         */
        if(StateManager.getCurrentState() instanceof MainMenuState) {
            //Play Button
            if (mouseX >= 350 && mouseX <= 450) {
                if (mouseY >= 150 && mouseY <= 200) {
                    StateManager.setCurrentState(new GameState());
                }
            }

            //High Scores Button
            if (mouseX >= 300 && mouseX <= 500) {
                if (mouseY >= 250 && mouseY <= 300) {
                    StateManager.setCurrentState(new HighScoresState());
                }
            }

            //Quit Button
            if (mouseX >= 350 && mouseX <= 450) {
                if (mouseY >= 350 && mouseY <= 400) {
                    StateManager.setCurrentState(new QuitState());

                    // TODO: Saving to file

                    System.exit(0);
                }
            }
        }

        // HighScores
        if(StateManager.getCurrentState() instanceof HighScoresState) {
            // Back Button
            if (mouseX >= 340 && mouseX <= 440) {
                if (mouseY >= 470 && mouseY <= 520) {
                    StateManager.setCurrentState(new MainMenuState());
                }
            }
        }

        // Quit
        if(StateManager.getCurrentState() instanceof GameOverState) {
            // Back Button
            if (mouseX >= 340 && mouseX <= 440) {
                if (mouseY >= 470 && mouseY <= 520) {
                    StateManager.setCurrentState(new MainMenuState());
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}