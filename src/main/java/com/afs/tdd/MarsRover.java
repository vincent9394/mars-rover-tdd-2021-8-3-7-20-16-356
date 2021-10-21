package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommands(String commands) {
        String[] singleCommand = commands.split("");
        for (int i = 0; i < commands.length(); i++) {
            executeCommand(singleCommand[i]);
            //executeCommand(""+commands.charAt(i));
        }
    }

    public void executeCommand(String command) {
        if (command.equals("M")) move();
        if (command.equals("L")) turnLeft();
        if (command.equals("R")) turnRight();
        // return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }


    private void move() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        String direction = getRoverStatus().getDirection();

        switch (direction) {
            case "N":
                locationY += 1;
                break;
            case "E":
                locationX += 1;
                break;
            case "S":
                locationY -= 1;
                break;
            case "W":
                locationX -= 1;
                break;

        }
        roverStatus = new RoverStatus(locationX, locationY, direction);
//        if(this.direction.equals("N")) this.locationY=this.locationY+1;
//        if(this.direction.equals("E")) this.locationX=this.locationX+1;
//        if(this.direction.equals("S")) this.locationY=this.locationY-1;
//        if(this.direction.equals("W")) this.locationX=this.locationX-1;
    }

    public RoverStatus getRoverStatus() {

        return roverStatus;
    }

    private void turnLeft() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        String direction = roverStatus.getDirection();
        String newDirection = direction;

        switch (direction) {
            case "N":
                newDirection = "W";
                break;
            case "E":
                newDirection = "N";
                break;
            case "S":
                newDirection = "E";
                break;
            case "W":
                newDirection = "S";
                break;
//        if( this.direction =="N") this.direction="W";
//        if( this.direction =="E") this.direction="N";
//        if( this.direction =="S") this.direction="E";
//        if( this.direction =="W") this.direction="S";

        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void turnRight() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        String direction = roverStatus.getDirection();
        String newDirection = direction;

        switch (direction) {
            case "N":
                newDirection = "E";
                break;
            case "E":
                newDirection = "S";
                break;
            case "S":
                newDirection = "W";
                break;
            case "W":
                newDirection = "N";
                break;
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
//        if( this.direction =="N") this.direction="E";
//        if( this.direction =="E") this.direction="S";
//        if( this.direction =="S") this.direction="W";
//        if( this.direction =="W") this.direction="N";
    }
}
