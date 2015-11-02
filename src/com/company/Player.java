package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by stil2_000 on 2.11.2015 ã..
 */
public class Player implements Firable{

    private int x;
    private int y;
    private Image playerIcon;

    public Player(int x, int y, String path){
        this.x = x;
        this.y = y;
        playerIcon = new BufferedImage();
    }

    public int getX(){
        return  this.x;
    }
    public int getY(){
        return this.y;
    }

    @Override
    public void fire() {

    }
}
