package com.company.game;

import com.company.graphics.ImageLoader;

import java.awt.image.BufferedImage;

//Note: If you extend the class and want to push the path from the child
//      you must add it's path to the ImageAlbum and take it from there in the concrete child class.

public class GameObject {
    //TODO: implement the basic fields of all obects in the game
    private int x;
    private int y;
    private BufferedImage gameObjectIcon;

    public GameObject(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.gameObjectIcon = ImageLoader.loadImage(path);
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
