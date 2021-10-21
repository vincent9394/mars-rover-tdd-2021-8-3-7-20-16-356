package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public String executeCommand(String command){
        if (command.equals("M")) move();
        return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }
    private void move(){
        if(this.direction.equals("N")) this.locationY=this.locationY+1;
        if(this.direction.equals("E")) this.locationX=this.locationX+1;
        if(this.direction.equals("S")) this.locationY=this.locationY-1;
        if(this.direction.equals("W")) this.locationX=this.locationX-1;
    }
}
