package com.company.graphics;

public enum ImageAlbum {
    //If you add another object to the game you must insert it in the enumeration here in order to get it's path
    Player("/resources/PlayerRebel.png"),
    EasyEnemy("/resources/TIEFighter.png"),
    SturdyEnemy("/resources/StarDestroyer.png"),
    DoubleDamageBonus(""),
    Bullet("/resources/bullet.png");


    private String path;

    ImageAlbum(String path) {
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }
}
