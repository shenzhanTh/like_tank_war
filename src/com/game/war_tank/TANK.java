package com.game.war_tank;

public class TANK {
    private int x, y, direct;

    public TANK(int x ,int y, int direct){
        this.x = x;
        this.y = y;
        this.direct = direct;
    }
    
    public int GetX(){
        return this.x;
    }
    public int GetY(){
        return this.y;
    }
    public int GetDirect(){
        return this.direct;
    }
   

    public void SetX(int x){
        this.x = x;
    }
    public void SetY(int y){
        this.y = y;
    }
    public void SetDirect(int direct){
        this.direct = direct;
    }
}
