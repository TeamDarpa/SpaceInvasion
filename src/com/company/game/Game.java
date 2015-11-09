package com.company.game;


import com.company.display.Display;
import com.company.game.concreteObjects.Bullet;
import com.company.game.AbstractObjects.Enemy;
import com.company.game.concreteObjects.KeyboardInput;
import com.company.game.concreteObjects.Player;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.List;



public class Game implements Runnable {
    public static Player player;
    private List<Enemy> enemiesList;
    private List<Bullet> bulletsList;

    private Display display;
    private boolean isRuning = false;

    private Thread thread;

    private KeyboardInput keyboardInput;

    private BufferStrategy bs;
    private Graphics g;


    private void init() {

        this.display = new Display("Star wars", 800, 600);
        this.keyboardInput = new KeyboardInput(this,this.display);
        this.player = new Player(350, 500, ImageAlbum.Player.getPath(), 5);


    }

    public void displayFrame() {
        //Display the current frame using the display frame;
        this.bs = this.display.getCanvas().getBufferStrategy();

        if (bs == null) {
            this.display.getCanvas().createBufferStrategy(2);
            return;
        }
        this.g = bs.getDrawGraphics();
        /////////DRAW HERE /////////////////

        g.clearRect(0, 0, 800, 600);

        BufferedImage bgImg = ImageLoader.loadImage(ImageAlbum.Background.getPath());
        g.drawImage(bgImg, 0, 0, null);


        player.render(g);
        ////////////// TO HERE////////////
        g.dispose();
        bs.show();


    }

    public void update() {
        //TODO: Implement collision detection
        //TODO: Listen for input from the user
        //TODO: update the states of the objects;

        player.update();
    }

    public synchronized void start() {
        if (isRuning) {
            return;
        }
        isRuning = true;
        thread = new Thread(this);
        thread.start();

    }

    public synchronized void stop() {
        if (!isRuning) {
            return;
        }
        isRuning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void run() {
        init();


        while (isRuning) {

            update();
            displayFrame();


        }

        stop();

    }

}

