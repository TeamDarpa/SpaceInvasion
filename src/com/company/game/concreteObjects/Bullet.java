package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.GameObject;

public class Bullet  extends GameObject {

        private int bulletStrenght;
        private static final int speedMultiplier = 1;
        private static final int strenghtMultiplier = 1;
        public Bullet(int x, int y, String path) {
                super(x, y, path, speedMultiplier);
                this.bulletStrenght = 1;
                this.bulletStrenght *= strenghtMultiplier;
        }
        public int getBulletStrenght(){
                return this.bulletStrenght;
        }
}
