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
        if (command.equals("L")) turnLeft();
        if (command.equals("R")) turnRight();
        return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }
    private void move(){
        String direction = this.direction;
        switch (direction){
            case "N":
                this.locationY=this.locationY+1;
                break;
            case "E":
                this.locationX=this.locationX+1;
                break;
            case "S":
                this.locationY=this.locationY-1;
                break;
            case "W":
                this.locationX=this.locationX-1;
                break;

        }
//        if(this.direction.equals("N")) this.locationY=this.locationY+1;
//        if(this.direction.equals("E")) this.locationX=this.locationX+1;
//        if(this.direction.equals("S")) this.locationY=this.locationY-1;
//        if(this.direction.equals("W")) this.locationX=this.locationX-1;
    }

    private void turnLeft() {
        String direction = this.direction;
        switch (direction) {
            case "N":
                this.direction = "W";
                break;
            case "E":
                this.direction = "N";
                break;
            case "S":
                this.direction = "E";
                break;
            case "W":
                this.direction = "S";
                break;
//        if( this.direction =="N") this.direction="W";
//        if( this.direction =="E") this.direction="N";
//        if( this.direction =="S") this.direction="E";
//        if( this.direction =="W") this.direction="S";

        }
    }
    private void turnRight(){
            String direction = this.direction;
            switch (direction){
                case "N":
                    this.direction="E";
                    break;
                case "E":
                    this.direction="S";
                    break;
                case "S":
                    this.direction="W";
                    break;
                case "W":
                    this.direction="N";
                    break;
        }
//        if( this.direction =="N") this.direction="E";
//        if( this.direction =="E") this.direction="S";
//        if( this.direction =="S") this.direction="W";
//        if( this.direction =="W") this.direction="N";
    }
}
