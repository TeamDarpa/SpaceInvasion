package com.company.game.AbstractObjects;


import com.company.graphics.ImageAlbum;

public abstract class Bonus extends GameObject {
    private int multiplierForDamage;

    public Bonus(int x, int y, String path, int multiplier) {
        super(x, y, ImageAlbum.DoubleDamageBonus.getPath());
        this.multiplierForDamage = multiplier;
    }

    public int getMultiplierForDamage() {
        return this.multiplierForDamage;
    }
}
