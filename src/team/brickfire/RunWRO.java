package team.brickfire;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import team.brickfire.robotParts.Robot;

/**
 * Utility class that starts the program and handles the order in which things happen
 * @version 3.0
 * @author Team BrickFire
 */
public class RunWRO {

    /**
     * This method gets called when the program starts
     * Also executes actions
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Robot robot = Robot.create(6.24, 8);
        Sound.beep();
        Button.waitForAnyPress();
    }
}

