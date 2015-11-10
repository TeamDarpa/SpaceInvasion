package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.GameObject;
import com.company.game.Game;
import com.company.graphics.Assets;
import com.company.screeStates.GameState;

import java.awt.*;

public class Bullet extends GameObject {

    private int bulletStrenght;
    private static final int speedMultiplier = 5;
    private static final int strenghtMultiplier = 1;

    public Bullet(int x, int y) {
        super(x, y, Assets.bullet, speedMultiplier);
        this.bulletStrenght = 1;
        this.bulletStrenght *= strenghtMultiplier;
    }

    public int getBulletStrenght() {
        return this.bulletStrenght;
    }

    @Override
    public void update() {
        this.getColliderBox().setBounds(this.getX(), this.getY(),
                this.getObjectIcon().getWidth(), this.getObjectIcon().getHeight());
        this.setY(this.getY() - this.getSpeed() * speedMultiplier);

        if (this.getY() == 0) {
            GameState.bulletsList.remove(this);
        }
    }


}
