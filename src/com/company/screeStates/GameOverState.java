package com.company.screeStates;

import com.company.graphics.Assets;

import java.awt.*;

public class GameOverState extends State implements Displayable{
    @Override
    public void update() {

    }
    public void display(Graphics g) {
        g.setColor(Color.GREEN);
        g.setFont(new Font("redensek",Font.PLAIN,100));
        g.drawImage(Assets.gameover,0,0,null);
        g.drawString("GAME OVER",190,300);
    }
}
