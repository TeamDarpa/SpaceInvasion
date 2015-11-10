package com.company.screeStates;


import com.company.game.AbstractObjects.Enemy;
import com.company.game.concreteObjects.Bullet;
import com.company.game.concreteObjects.EasyEnemy;
import com.company.game.concreteObjects.Player;
import com.company.game.concreteObjects.SturdyEnemy;
import com.company.graphics.Assets;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GameState extends State implements Displayable{
    public static Player player;
    public static List<Enemy> enemiesList;
    public static List<Bullet> bulletsList;
    public Random rnd = new Random();
    public static int score = 0;
    private int enemyTypes = 1;

    public GameState() {
        init();
        this.bulletsList = new LinkedList<>();
        this.player = new Player(350, 500, "Player", 14);
        this.enemiesList = new LinkedList<>();
        enemiesList.add(new EasyEnemy(rnd.nextInt(725), -100));

    }

    public void init() {
        Assets.init();

    }


    @Override
    public void update() {
        player.update();
        if(Enemy.passed >= 3){          //if player misses three enemies loses one live
            player.setNumberOfLives(player.getNumberOfLives()-1);
        }
        for (int i = 0; i < bulletsList.size(); i++) {
            bulletsList.get(i).update();
        }
        for (int i = 0; i < enemiesList.size(); i++) {

            if(player.collide(enemiesList.get(i).getColliderBox())) {
                player.setNumberOfLives(player.getNumberOfLives()-1);
                enemiesList.remove(i);
                break;
            }
            enemiesList.get(i).update();
        }
        if (enemiesList.size()<3) {
            if (enemyTypes == 3) {
                enemiesList.add(new SturdyEnemy(rnd.nextInt(725), -100));
                enemyTypes = 0;
            } else enemiesList.add((new EasyEnemy(rnd.nextInt(725), -100)));
            enemyTypes++;
        }
        if(player.getNumberOfLives()==0) {
            StateManager.setCurrentState(new GameOverState());
        }





    }
    @Override
    public void display(Graphics g) {
        g.drawImage(Assets.background, 0, 0, null);
        player.render(g);
        for (int i = 0; i < bulletsList.size(); i++) {
            bulletsList.get(i).render(g);
        }
        for (int i = 0; i < enemiesList.size(); i++) {
            enemiesList.get(i).render(g);
        }
        g.setFont(new Font("redensek",Font.PLAIN,40));
        g.setColor(Color.GREEN);
        g.drawString(String.format("Score:%d",this.score), 30, 50);
        g.drawString("Lives:", 570, 50);
        for (int i = 0; i < player.getNumberOfLives(); i++) {
            g.drawImage(Assets.live,660+i*38,30,null);
        }

    }
}
