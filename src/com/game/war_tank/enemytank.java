package com.game.war_tank;

public class enemytank extends TANK{
    private int type = 1;
    
    public enemytank(int x, int y, int direct){
        super(x, y, direct);
    }
    
    public int GetType(){
        return this.type;
    }
}
