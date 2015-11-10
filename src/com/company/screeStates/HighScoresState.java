package com.company.screeStates;

import com.company.graphics.Assets;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HighScoresState extends State {

    public static final int ROW_HEIGHT = 35;
    public Rectangle backButton = new Rectangle(340, 470, 100, 50);
    private int row = 0;

    @Override
    public void update() {

    }

    @Override
    public void display(Graphics g) {
        Font blackout = new Font("redensek", Font.PLAIN, 40);
        Graphics2D g2d = (Graphics2D) g;
        g.setFont(blackout);
        FontMetrics fontMetrics = g.getFontMetrics();
        g.setColor(Color.green);
        g.drawImage(Assets.highScoresBackground, 0, 0, null);
        g.drawString("High Scores", 330, 50);
        g.drawString("Name",130, 85);
        g.drawString("score", 700 - fontMetrics.stringWidth("score"), 85);
        g.setColor(Color.white);

        for (Map.Entry<String, Integer> entry : Assets.highScores.entrySet()) {
            row++;
            g.drawString(String.valueOf(row) + ".", 80, 95 + ROW_HEIGHT * row);
            g.drawString(entry.getKey(), 130, 95 + ROW_HEIGHT * row);
            String str = String.valueOf(entry.getValue());
            g.drawString(String.format("%d", entry.getValue()), 700 - fontMetrics.stringWidth(str), 95 + ROW_HEIGHT * row);

            if (row == 10) {
                break;
            }
        }

        g.drawString("Back", 350, 500);
        g2d.draw(backButton);

        row = 0;
    }

}

