package com.company.screeStates;

import com.company.eventHandlers.MouseInput;
import com.company.graphics.Assets;

import java.awt.*;

public class ChooseSideState extends State {

    //TODO: Display the menu with options and listen for the event clicked
    public Rectangle sithButton = new Rectangle(50, 300, 300, 100);
    public Rectangle rebelButton = new Rectangle(450, 300, 300, 100);

    public ChooseSideState() {

    }
    @Override
    public void update() {

    }

    public void display(Graphics g) {
        g.drawImage(Assets.chooseSide, 0, 0, null);
        Graphics2D g2d = (Graphics2D) g;

        g2d.draw(sithButton);
        g2d.draw(rebelButton);
    }

}