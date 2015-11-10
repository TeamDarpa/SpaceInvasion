package com.company.screeStates;

import com.company.graphics.Assets;

import java.awt.*;

public class GameOverState extends State implements Displayable {

    public Rectangle backButton = new Rectangle(340, 470, 100, 50);

    @Override
    public void update() {

    }

    public void display(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GREEN);

        g.setFont(new Font("redensek", Font.PLAIN, 100));
        g.drawImage(Assets.gameover, 0, 0, null);
        g.drawString("GAME OVER", 190, 300);

        g.setFont(new Font("redensek", Font.PLAIN, 40));
        g.drawString("Back", 350, 500);
        g2d.draw(backButton);
    }

}
