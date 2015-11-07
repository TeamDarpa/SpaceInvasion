package com.company.game.AbstractObjects;

import com.company.graphics.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

//Note: If you extend the class and want to push the path from the child
//      you must add it's path to the ImageAlbum and take it from there in the concrete child class.

public class GameObject {
    //TODO: implement the basic fields of all obects in the game
    private int x;
    private int y;
    private int speed;
    private Rectangle colliderBox;
    private BufferedImage gameObjectIcon;

    public GameObject(int x, int y, String path, int speedMultiplier) {
        this.x = x;
        this.y = y;
        this.speed = 1 * speedMultiplier;
        this.gameObjectIcon = ImageLoader.loadImage(path);
        this.colliderBox = new Rectangle(this.gameObjectIcon.getWidth(), this.gameObjectIcon.getHeight());
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public BufferedImage getPlayerIcon() {
        return this.gameObjectIcon;
    }
}
