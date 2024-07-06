package com.game.war_tank;

import javax.swing.JFrame;
import javax.swing.*;

public class tank_main extends JFrame {
    myPanel mp = null;

    public static void main(String[] args) {
        tank_main mainn = new tank_main();
    }

    public tank_main() {

        mp = new myPanel();
        this.add(mp);
        this.setSize(500, 500);
        this.addKeyListener(mp);// 监听面板的事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
