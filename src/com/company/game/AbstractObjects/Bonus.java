package com.company.game.AbstractObjects;


import com.company.graphics.ImageAlbum;

public abstract class Bonus extends GameObject {
    private int multiplierForDamage;

    public Bonus(int x, int y, String path, int damageMultiplier, int speedMultiplier) {
        super(x, y, ImageAlbum.DoubleDamageBonus.getPath(), speedMultiplier);
        this.multiplierForDamage = damageMultiplier;
    }

    public int getMultiplierForDamage() {
        return this.multiplierForDamage;
    }
}
