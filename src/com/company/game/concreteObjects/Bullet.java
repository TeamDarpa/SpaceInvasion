package com.company.game.concreteObjects;

import com.company.game.AbstractObjects.GameObject;

public class Bullet  extends GameObject {

        private int bulletStrenght;

        public Bullet(int x, int y, String path, int multiplier) {
                super(x, y, path);
                this.bulletStrenght = 1;
                this.bulletStrenght *= multiplier;
        }
        public int getBulletStrenght(){
                return this.bulletStrenght;
        }
}
