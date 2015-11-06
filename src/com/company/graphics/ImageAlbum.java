package com.company.graphics;

public enum ImageAlbum {
    //If you add another object to the game you must insert it in the enumeration here in order to get it's path
    Player("/resources/MilleniumFalcon65.png"),
    EasyEnemy("/resources/TIEFighter65.png"),
    SturdyEnemy("/resources/StarDestroyer65.png"),
    DoubleDamageBonus(""),
    Bullet("/resources/beams65.png");


    private String path;

    ImageAlbum(String path) {
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }
}
