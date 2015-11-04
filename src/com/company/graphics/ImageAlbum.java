package com.company.graphics;

import com.company.game.Bullet;
import com.company.game.Enemy;

public enum ImageAlbum {
    //If you add another object to the game you must insert it in the enumeration here in order to get it's path
    Player(""),
    Enemy(""),
    Bullet("");

    private String path;

    ImageAlbum(String path) {
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }
}
