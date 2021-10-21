package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    private MarsRover MarsRover;
    private int locationX;
    private int locationY;
    private String direction; // N E S W
    private String command; // M R L
    private String expected;
    private String actual;

    @BeforeEach
    public void setup() {


    }

    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_N_command_M() {
//        given
        locationX=0;
        locationY=0;
        direction="N";
        command= "M";
        expected= "0 1 N";
        MarsRover MarsRover = new MarsRover(locationX, locationY,direction);

//        when
        actual =MarsRover.executeCommand(command);

//        then
        assertEquals(expected,actual);
    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_E_command_M() {
//        given
        locationX=0;
        locationY=0;
        direction="E";
        command= "M";
        expected= "1 0 E";
        MarsRover MarsRover = new MarsRover(locationX, locationY,direction);

//        when
        actual =MarsRover.executeCommand(command);

//        then
        assertEquals(expected,actual);
    }

    @Test
    void should_locationY_minus_one_space_when_execute_command_given_direction_S_command_M() {
//        given
        locationX=0;
        locationY=0;
        direction="S";
        command= "M";
        expected= "0 -1 S";
        MarsRover MarsRover = new MarsRover(locationX, locationY,direction);

//        when
        actual =MarsRover.executeCommand(command);

//        then
        assertEquals(expected,actual);
    }

    @Test
    void should_locationX_minus_one_space_when_execute_command_given_direction_W_command_M() {
//        given
        locationX=0;
        locationY=0;
        direction="W";
        command= "M";
        expected= "-1 0 W";
        MarsRover MarsRover = new MarsRover(locationX, locationY,direction);

//        when
        actual =MarsRover.executeCommand(command);

//        then
        assertEquals(expected,actual);
    }
}
