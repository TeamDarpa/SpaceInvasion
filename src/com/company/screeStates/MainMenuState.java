package com.company.screeStates;

import com.company.graphics.Assets;

import java.awt.*;

public class MainMenuState extends State {
    //TODO: Display the menu with options and listen for the event clicked
    private int currentSelection;

    public Rectangle playButton = new Rectangle(350, 150, 100, 50);
    public Rectangle highScoreButton = new Rectangle(300, 250, 200, 50);
    public Rectangle quitButton = new Rectangle(350, 350, 100, 50);


    @Override
    public void update() {

    }

    public void display(Graphics g) {
        g.drawImage(Assets.background, 0, 0, null);
        Graphics2D g2d = (Graphics2D) g;


        Font titleFont = new Font("arial", Font.BOLD, 50);
        g.setFont(titleFont);
        g.setColor(Color.white);
        g.drawString("Space Invasion!", 200, 100);

        Font buttonsFont = new Font("arial", Font.BOLD, 30);
        g.setFont(buttonsFont);
        g.drawString("Play", playButton.x + 20, playButton.y + 35);
        g2d.draw(playButton);
        g.drawString("High Scores", highScoreButton.x + 15, highScoreButton.y + 35);
        g2d.draw(highScoreButton);
        g.drawString("Quit", quitButton.x + 20, quitButton.y + 35);
        g2d.draw(quitButton);


    }


}
