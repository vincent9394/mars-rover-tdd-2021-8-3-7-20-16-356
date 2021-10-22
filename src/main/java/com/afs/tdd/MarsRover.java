package com.afs.tdd;

public class MarsRover {
    private static final String NORTH = "N";  //option + command + c
    private RoverStatus roverStatus;

//    private  String east ="E";
//    private  String south = "S";
//    private  String west = "w";

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public String executeCommands(String commands) {
        String[] singleCommand = commands.split("");
        for (int i = 0; i < commands.length(); i++) {
            executeCommand(singleCommand[i]);

        }
        return String.format("%d %d %s", roverStatus.getLocationX(), roverStatus.getLocationY(), roverStatus.getDirection());
    }

    public void executeCommand(String command) {
        if (command.equals("M")) move();
        if (command.equals("L")) turnLeft();
        if (command.equals("R")) turnRight();
        // return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }

    //array [N,E,S,W]
    private void move() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        String direction = roverStatus.getDirection();

        switch (direction) {
            case NORTH:
                // locationY += 1;
                roverStatus.setLocationY(locationY + 1);
                break;
            case "E":
                roverStatus.setLocationX(locationX + 1);
                break;
            case "S":
                roverStatus.setLocationY(locationY - 1);
                break;
            case "W":
                roverStatus.setLocationX(locationX - 1);
                break;

        }

    }


    private void turnLeft() {

        String direction = roverStatus.getDirection();


        switch (direction) {
            case NORTH:
                roverStatus.setDirection("W");
                break;
            case "E":
                roverStatus.setDirection(NORTH);
                break;
            case "S":
                roverStatus.setDirection("E");
                break;
            case "W":
                roverStatus.setDirection("S");
                break;

        }

    }

    private void turnRight() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        String direction = roverStatus.getDirection();
        String newDirection = direction;

        switch (direction) {
            case NORTH:
                newDirection = "E";
                break;
            case "E":
                newDirection = "S";
                break;
            case "S":
                newDirection = "W";
                break;
            case "W":
                newDirection = NORTH;
                break;
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }
}
