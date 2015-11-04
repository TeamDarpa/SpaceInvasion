package com.company.game.AbstractObjects;

/**
 * Created by stil2_000 on 4.11.2015 ã..
 */
public abstract class Bonus extends GameObject {
    private int multiplierForDamage;
    public Bonus(int x, int y, String path, int multiplier) {
        super(x, y, path);
        this.multiplierForDamage = multiplier;
    }
}
