package com.game.eatsnake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class window_open extends JFrame{
    public window_open(){}
    public void launch(){
        this.setVisible(true);
        this.setSize(900, 1000);
        this.setLocationRelativeTo(null);
        this.setTitle("eating snake");
    }
    @Override
    public void paint(Graphics window){
        window.setColor(Color.BLACK);
        window.fillRect(0, 0, 900, 900);
        window.setColor(Color.GREEN);
        for(int i = 1; i <= 30; i++){
            window.drawLine(30, i * 30, 870, i * 30);
            window.drawLine(i * 30, 30, i * 30, 870);
        }
    }
}
