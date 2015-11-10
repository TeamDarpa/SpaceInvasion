package com.company.graphics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AAAA on 9.11.2015 г..
 */
public class Assets {
    public static BufferedImage background;
    public static BufferedImage player;
    public static BufferedImage bullet;
    public static BufferedImage easyEnemy;
    public static BufferedImage sturdyEnemy;
    public static BufferedImage doubleDamageBonus;
    public static BufferedImage highScoresBackground;
    public static BufferedImage live;
    public static BufferedImage gameover;

    private static SortedMap<String,Integer> scores;
    public static Map<String,Integer> highScores;
    public static int lowestScore;

    public static void init() {
        background = ImageLoader.loadImage(ImageAlbum.Background.getPath());
        player = ImageLoader.loadImage(ImageAlbum.Player.getPath());
        bullet = ImageLoader.loadImage(ImageAlbum.Bullet.getPath());
        easyEnemy = ImageLoader.loadImage(ImageAlbum.EasyEnemy.getPath());
        sturdyEnemy = ImageLoader.loadImage(ImageAlbum.SturdyEnemy.getPath());
        live = ImageLoader.loadImage(ImageAlbum.Live.getPath());
        //doubleDamageBonus = ImageLoader.loadImage(ImageAlbum.DoubleDamageBonus.getPath());
        highScoresBackground = ImageLoader.loadImage(ImageAlbum.HighScores.getPath());
        gameover = ImageLoader.loadImage(ImageAlbum.Gameover.getPath());
        try {
            GraphicsEnvironment ge =
                    GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("res\\REDENSEK.TTF")));
        } catch (IOException |FontFormatException e) {
            //Handle exception
        }



        scores = new TreeMap<>();
        highScores = new LinkedHashMap<>();
        List<Map.Entry<String,Integer>> list;

        try (BufferedReader fileReader = new BufferedReader(new FileReader("res\\highScores.txt"))) {
            String line = fileReader.readLine();
            String[] tokens;
            while (line != null) {
                tokens = line.split(" ");
                scores.put(tokens[0],Integer.parseInt(tokens[1]));

                line = fileReader.readLine();
            }
        } catch (IOException ioex) {
            System.err.println("Cannot read the file");
        }
        list = new ArrayList<>(scores.entrySet());
        Collections.sort(list,(a,b) -> b.getValue().compareTo(a.getValue()));
        if(list.size()>10) list.subList(0,10);
        for (Map.Entry<String, Integer> entry : list) {
            highScores.put(entry.getKey(),entry.getValue());
        }
        lowestScore = list.get(list.size()-1).getValue();
    }
}
