package com.game.war_tank;

public enum numbuers {
    enemytank_default_direct(3), mytank_default_direct(1), left(0), up(1), right(2), down(3), 
    big_ball(20), small_ball(10);

    private int number;

    private numbuers(int num) {
        this.number = num;
    }

    public int getnum(){
        return this.number;
    }
}
