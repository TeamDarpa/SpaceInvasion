package com.company.screeStates;

import com.company.gameObjectsInterfaces.Displayable;

import java.awt.*;

public abstract class State implements Displayable {

    public abstract void update();

    @Override
    public void display(Graphics g) {

    }

}
