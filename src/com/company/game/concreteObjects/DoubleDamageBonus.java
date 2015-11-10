package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.Bonus;
import com.company.graphics.Assets;
import com.company.graphics.ImageAlbum;

public class DoubleDamageBonus extends Bonus {

    private static final int DAMAGE_MULTIPLIER = 2;
    private static final int SPEED_MULTIPLIER = 1;

    public DoubleDamageBonus(int x, int y) {
        super(x, y, Assets.doubleDamageBonus, DAMAGE_MULTIPLIER, SPEED_MULTIPLIER);
    }
    @Override
    public void update(){

    }

}
