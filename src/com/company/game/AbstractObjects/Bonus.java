package com.company.game.AbstractObjects;

import com.company.graphics.Assets;
import com.company.screeStates.GameState;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Bonus extends GameObject {

    private int multiplierForDamage;
    private Rectangle colliderBox;

    public Bonus(int x, int y, BufferedImage gameObjectIcon, int damageMultiplier, int speedMultiplier) {
        super(x, y, Assets.doubleDamageBonus, speedMultiplier);
        this.multiplierForDamage = damageMultiplier;
    }

    public int getMultiplierForDamage() {
        return this.multiplierForDamage;
    }
}
