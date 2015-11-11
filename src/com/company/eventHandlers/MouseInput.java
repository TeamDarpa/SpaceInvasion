package com.company.eventHandlers;

import com.company.graphics.Assets;
import com.company.graphics.Display;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;
import com.company.screeStates.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
    public static boolean isRebel;
    public MouseInput(Display display) {
        display.getCanvas().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        if(StateManager.getCurrentState() instanceof MainMenuState) {
            //Play Button
            if (mouseX >= 350 && mouseX <= 450) {
                if (mouseY >= 150 && mouseY <= 200) {
                    StateManager.setCurrentState(new ChooseSideState());
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
        else if(StateManager.getCurrentState() instanceof ChooseSideState) {

            //Sith Button
            if (mouseX >= 50 && mouseX <= 350) {
                if (mouseY >= 300 && mouseY <= 400) {
                    isRebel = false;
                    StateManager.setCurrentState(new GameState());
                }
            }

            //Rebels Button
            if (mouseX >= 450 && mouseX <= 750) {
                if (mouseY >= 300 && mouseY <= 400) {
                    isRebel = true;
                    StateManager.setCurrentState(new GameState());
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