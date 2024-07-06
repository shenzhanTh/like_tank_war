package com.game.war_tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;

public class myPanel extends JPanel implements KeyListener {

    Vector<enemytank> enemytanks = new Vector<>();
    mytank mytanks = null;

    public myPanel() {
        mytanks = new mytank(100, 100, numbuers.mytank_default_direct.getnum());
        for (int i = 0; i < 3; i++) {
            enemytank enemytank_tem = new enemytank(
                    i * (numbuers.big_ball.getnum() + numbuers.small_ball.getnum()) + 10, 10,
                    numbuers.enemytank_default_direct.getnum());
            enemytanks.add(enemytank_tem);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 500, 500);
        creat_tank(mytanks.GetX(), mytanks.GetY(), g, mytanks.GetDirect(), mytanks.GetType());
        for (int i = 0; i < 3; i++) {
            creat_tank(enemytanks.get(i).GetX(), enemytanks.get(i).GetY(), g, enemytanks.get(i).GetDirect(),
                    enemytanks.get(i).GetType());
        }
    }

    // 无关的接口方法
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        switch (e.getKeyCode()) {
            case 87: // up
                mytanks.SetDirect(numbuers.up.getnum());
                mytanks.SetY(mytanks.GetY() - 10);
                break;
            case 83: // down
                mytanks.SetDirect(numbuers.down.getnum());
                mytanks.SetY(mytanks.GetY() + 10);
                break;
            case 65: // left
                mytanks.SetDirect(numbuers.left.getnum());
                mytanks.SetX(mytanks.GetX() - 10);
                break;
            case 68: // right
                mytanks.SetDirect(numbuers.right.getnum());
                mytanks.SetX(mytanks.GetX() + 10);
                break;
            default:
                System.out.println("unvalid direction");
                break;
        }
        this.repaint();
    }

    public void creat_tank(int x, int y, Graphics g, int direct, int type) {
        // f & E
        switch (type) {
            case 0: // friends
                g.setColor(Color.WHITE);
                break;
            case 1: // enemy
                g.setColor(Color.CYAN);
                break;
        }

        // direction
        switch (direct) {

            case 0:
                g.drawOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.fillOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.setColor(Color.BLACK);
                g.drawOval(x - numbuers.small_ball.getnum(), y - numbuers.small_ball.getnum(),
                        numbuers.small_ball.getnum(), numbuers.small_ball.getnum());
                g.fillOval(x - numbuers.small_ball.getnum(), y - numbuers.small_ball.getnum(),
                        numbuers.small_ball.getnum(), numbuers.small_ball.getnum());
                break;
            case 1:
                g.drawOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.fillOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.setColor(Color.BLACK);
                g.drawOval(x + numbuers.big_ball.getnum(), y - numbuers.small_ball.getnum(),
                        numbuers.small_ball.getnum(), numbuers.small_ball.getnum());
                g.fillOval(x + numbuers.big_ball.getnum(), y - numbuers.small_ball.getnum(),
                        numbuers.small_ball.getnum(), numbuers.small_ball.getnum());
                break;
            case 2:
                g.drawOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.fillOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.setColor(Color.BLACK);
                g.drawOval(x + numbuers.big_ball.getnum(), y + numbuers.big_ball.getnum(), numbuers.small_ball.getnum(),
                        numbuers.small_ball.getnum());
                g.fillOval(x + numbuers.big_ball.getnum(), y + numbuers.big_ball.getnum(), numbuers.small_ball.getnum(),
                        numbuers.small_ball.getnum());
                break;
            case 3:
                g.drawOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.fillOval(x, y, numbuers.big_ball.getnum(), numbuers.big_ball.getnum());
                g.setColor(Color.BLACK);
                g.drawOval(x - numbuers.small_ball.getnum(), y + numbuers.big_ball.getnum(),
                        numbuers.small_ball.getnum(), numbuers.small_ball.getnum());
                g.fillOval(x - numbuers.small_ball.getnum(), y + numbuers.big_ball.getnum(),
                        numbuers.small_ball.getnum(), numbuers.small_ball.getnum());
                break;

            default:
                break;
        }

    }
}
