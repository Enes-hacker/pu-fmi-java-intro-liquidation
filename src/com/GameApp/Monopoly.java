package com.GameApp;
import org.w3c.dom.Text;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Monopoly implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JPanel pannel = new JPanel();
    JButton[] buttons = new JButton[20];




    Monopoly(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);


        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Monopoly");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,800);



        button_panel.setLayout(new GridBagLayout());
        button_panel.setBackground(new Color(50,150,150));
        GridBagConstraints gbc = new GridBagConstraints();




        buttons[1] = new JButton("Chance");
        buttons[1].setFont(new Font("",Font.BOLD,12));
        buttons[1].setBounds(50,50,50,50);
        gbc.gridx = 0;
        gbc.gridy = 0;
        button_panel.add(buttons[1],gbc);

        buttons[2] = new JButton("partyhard");
        buttons[2].setFont(new Font("",Font.BOLD,12));
        buttons[2].setBounds(50,50,50,50);
        gbc.gridx = 1;
        gbc.gridy = 0;

        button_panel.add(buttons[2],gbc);

        buttons[3] = new JButton("Trap");
        buttons[3].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 2;
        gbc.gridy = 0;
        button_panel.add(buttons[3],gbc);

        buttons[4] = new JButton("Steal");
        buttons[4].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 3;
        gbc.gridy = 0;
        button_panel.add(buttons[4],gbc);

        buttons[5] = new JButton("partyhard");
        buttons[5].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 4;
        gbc.gridy = 0;
        button_panel.add(buttons[5], gbc);

        buttons[6] = new JButton("Trap");
        buttons[6].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 5;
        gbc.gridy = 0;
        button_panel.add(buttons[6], gbc);

        buttons[7] = new JButton("Invest");
        buttons[7].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 6;
        gbc.gridy = 0;
        button_panel.add(buttons[7], gbc);

        buttons[8] = new JButton("Chance");
        buttons[8].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 7;
        gbc.gridy = 0;
        button_panel.add(buttons[8], gbc);

        buttons[9] = new JButton("Trap");
        buttons[9].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 0;
        gbc.gridy = 1;
        button_panel.add(buttons[9],gbc);

        buttons[10] = new JButton("Steal");
        buttons[10].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 0;
        gbc.gridy = 2;
        button_panel.add(buttons[10],gbc);

        buttons[11] = new JButton("Chance");
        buttons[11].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 0;
        gbc.gridy = 3;
        button_panel.add(buttons[11],gbc);

        buttons[12] = new JButton("trap");
        buttons[12].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 1;
        gbc.gridy = 3;
        button_panel.add(buttons[12],gbc);

        buttons[13] = new JButton("partyhard");
        buttons[13].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 2;
        gbc.gridy = 3;
        button_panel.add(buttons[13],gbc);

        buttons[14] = new JButton("Invest");
        buttons[14].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 3;
        gbc.gridy = 3;
        button_panel.add(buttons[14],gbc);

        buttons[15] = new JButton("Trap");
        buttons[15].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 4;
        gbc.gridy = 3;
        button_panel.add(buttons[15],gbc);

        buttons[16] = new JButton("Trap");
        buttons[16].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 5;
        gbc.gridy = 3;
        button_panel.add(buttons[16],gbc);

        buttons[17] = new JButton("Trap");
        buttons[17].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 6;
        gbc.gridy = 3;
        button_panel.add(buttons[17], gbc);

        buttons[18] = new JButton("Start");
        buttons[18].setFont(new Font("",Font.BOLD,20));
        gbc.gridx = 7;
        gbc.gridy = 3;
        button_panel.add(buttons[18], gbc);

        buttons[19] = new JButton("Steal");
        buttons[19].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 7;
        gbc.gridy = 2;
        button_panel.add(buttons[19],gbc);

        buttons[0] = new JButton("Invest");
        buttons[0].setFont(new Font("",Font.BOLD,12));
        gbc.gridx = 7;
        gbc.gridy = 1;
        button_panel.add(buttons[0],gbc);






        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);







    }


    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
