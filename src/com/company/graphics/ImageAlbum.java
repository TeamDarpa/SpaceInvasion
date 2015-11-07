package com.company.graphics;

public enum ImageAlbum {
    //If you add another object to the game you must insert it in the enumeration here in order to get it's path
    Player("/MilleniumFalcon65.png"),
    EasyEnemy("/TIEFighter65.png"),
    SturdyEnemy("/StarDestroyer65.png"),
    DoubleDamageBonus(""),
    Bullet("/beams65.png"),
    Background("/bg.jpg");



    private String path;

    ImageAlbum(String path) {
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }
}
