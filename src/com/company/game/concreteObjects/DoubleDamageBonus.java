package com.company.game.concreteObjects;


import com.company.game.AbstractObjects.Bonus;
import com.company.graphics.ImageAlbum;

public class DoubleDamageBonus extends Bonus {
    private static final int MULTIPLIER = 2;
    public DoubleDamageBonus(int x, int y) {
        super(x, y, ImageAlbum.DoubleDamageBonus.getPath(), MULTIPLIER);
    }

}
