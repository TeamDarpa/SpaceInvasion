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

    public GameObject(int x, int y, BufferedImage gameObjectIcon, int speedMultiplier) {
        this.x = x;
        this.y = y;
        this.speed = speedMultiplier;
        this.gameObjectIcon = gameObjectIcon;
        this.colliderBox = new Rectangle(this.x,this.y,this.gameObjectIcon.getWidth(), this.gameObjectIcon.getHeight());

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public BufferedImage getObjectIcon() {
        return this.gameObjectIcon;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getSpeed() {
        return speed;
    }

    public Rectangle getColliderBox() {
        return colliderBox;
    }

    public void setColliderBox(Rectangle colliderBox) {
        this.colliderBox = colliderBox;
    }

    public boolean collide(Rectangle r) {
        if (this.colliderBox.intersects(r)) return true;
        return false;
    }
}