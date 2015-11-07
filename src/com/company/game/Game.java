package com.company.game;


import com.company.display.Display;
import com.company.game.concreteObjects.Bullet;
import com.company.game.AbstractObjects.Enemy;
import com.company.game.concreteObjects.KeyboardInput;
import com.company.game.concreteObjects.Player;
import com.company.graphics.ImageAlbum;
import com.company.graphics.ImageLoader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.List;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;


public class Game implements Runnable {
    private Player player;
    private List<Enemy> enemiesList;
    private List<Bullet> bulletsList;

    private Display display;
    private boolean isRuning = false;

    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;


    private void init() {

        this.display = new Display("Star wars", 800, 600);
        addKeyListener(new KeyboardInput(this));


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

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            player.setX(player.getX() + player.getSpeed());

        } else if (key == KeyEvent.VK_LEFT) {
            player.setX(player.getX() - player.getSpeed());

        } else if (key == KeyEvent.VK_UP) {
            player.setY(player.getY() - player.getSpeed());

        } else if (key == KeyEvent.VK_DOWN) {
            player.setY(player.getY() + player.getSpeed());

        } else if (key == KeyEvent.VK_BACK_SPACE) {

        }
        if (key == KeyEvent.VK_SPACE) {

        }


    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            player.setX(player.getX() + 0);

        } else if (key == KeyEvent.VK_LEFT) {
            player.setX(player.getX() - 0);

        } else if (key == KeyEvent.VK_UP) {
            player.setY(player.getY() - 0);
        } else if (key == KeyEvent.VK_DOWN) {
            player.setY(player.getY() + 0);
        }

        if (key == KeyEvent.VK_SPACE) {

        }
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
        long lastTime = System.nanoTime();
        final double FPS = 60.0;
        double ns = 1000000000 / FPS;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        while (isRuning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            if (delta >= 1) {
                update();
                updates++;
                delta--;
            }
            displayFrame();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println(updates + " Ticks, Frames " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }
}
