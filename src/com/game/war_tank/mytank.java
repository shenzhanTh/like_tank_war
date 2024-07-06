package com.game.war_tank;

public class mytank extends TANK{

    private int type = 0;

    public mytank(int x, int y, int direct){
        super(x, y, direct);
    }

    public int GetType(){
        return this.type;
    }
}
