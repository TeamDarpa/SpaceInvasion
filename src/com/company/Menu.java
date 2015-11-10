package com.company;

import java.awt.*;

public class Menu {

    public Rectangle playButton = new Rectangle(400 + 120, 150, 100, 50);
    public Rectangle controlsButton = new Rectangle(400 + 120, 250, 100, 50);
    public Rectangle quitButton = new Rectangle(400 + 120, 150, 300, 50);


    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;


        Font titleFont = new Font("arial", Font.BOLD, 50);
        g.setFont(titleFont);
        g.setColor(Color.white);
        g.drawString("Space Invasion!", 400, 100);

        Font buttonsFont = new Font("arial", Font.BOLD, 10);
        g.setFont(buttonsFont);
        ((Graphics2D) g).drawString("Play", playButton.x + 20, playButton.y + 30);
        g2d.draw(playButton);
        g2d.draw(controlsButton);
        g2d.draw(quitButton);
    }
}
