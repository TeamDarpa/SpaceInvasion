package com.company.game;

import com.company.display.Display;
import com.company.game.concreteObjects.Bullet;
import com.company.game.AbstractObjects.Enemy;
import com.company.game.concreteObjects.Player;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;

import java.awt.*;
import java.util.List;


public class Game implements Runnable {
    private Player player;
    private List<Enemy> enemiesList;
    private List<Bullet> bulletsList;
    public Display display = new Display("Star wars", 800, 600);

    public void displayFrame(){
        //Display the current frame using the display frame;
        display.getCanvas().getGraphics().clearRect(0, 0, 800, 600);
        Image bgImg = ImageLoader.loadImage(ImageAlbum.Background.getPath());
        display.getCanvas().getGraphics().drawImage(bgImg, 0, 0, bgImg.getWidth(null), bgImg.getHeight(null), null);
    }
    public void update(){
        //TODO: Implement collision detection
        //TODO: Listen for input from the user
        //TODO: update the states of the objects;
    }
    @Override
    public void run() {

    }
}
