package com.company.game.concreteObjects;


import com.company.game.AbstractObjects.Bonus;
import com.company.graphics.ImageAlbum;

public class DoubleDamageBonus extends Bonus {
    private static final int DAMAGE_MULTIPLIER = 2;
    private static final int SPEED_MULTIPLIER = 1;
    public DoubleDamageBonus(int x, int y) {
        super(x, y, ImageAlbum.DoubleDamageBonus.getPath(), DAMAGE_MULTIPLIER, SPEED_MULTIPLIER);
    }

}
