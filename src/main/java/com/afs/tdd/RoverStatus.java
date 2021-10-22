package com.afs.tdd;

public class RoverStatus {
    private int locationX;
    private int locationY;
    private String direction;

    public RoverStatus(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;

    }

    public int getLocationX(){
        return this.locationX;
    }

    public int getLocationY() {
        return this.locationY;
    }

    public String getDirection(){
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }
}
