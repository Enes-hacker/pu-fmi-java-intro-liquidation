package com.GameApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.JButton.*;

public class Dice {
   Random random = new Random();
    JButton dice = new JButton();
    JFrame frame = new JFrame();
    boolean player;
    boolean computer_move;


    Dice () {
        int throw1 = random.nextInt(6)+1;
        dice = new JButton();
        dice .setBounds(50,50,50,50);
        dice.setFocusable(false);
        dice.setVisible(true);
        if (player == true) {
            dice.setText("player moves: " + (throw1));
        }
       else {
           dice.setText("computer moves: " + (throw1));
        }



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.getContentPane().setBackground(new Color(100,100,100));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.add(dice);
        frame.setResizable(false);
        frame.setLayout(new GridLayout());



    }



}
