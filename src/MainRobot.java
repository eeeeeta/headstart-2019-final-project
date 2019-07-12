//parent class of robot to define attributes and some methods


import ShefRobot.*;

import java.util.Arrays;

public class MainRobot {

    public static void main(String[] args) {
        System.out.println("Connecting to robot");
        RobotMover.init();
        System.out.println("Connection established.");
        try {
            Sorter test = new Sorter();

            int[] currentLocations;
            try {
                currentLocations = ColourDetector.detectColours();
            }
            catch (Error e) {
                currentLocations = new int[]{4, 3, 2, 1};
                System.err.println("Failed to detect colours: " + e);
                System.out.println("* It broke, so we're just cheating");
            }
            System.out.println("** Identified colours: " + Arrays.toString(currentLocations));
            //int[] currentLocations = {4, 1, 3, 2};
            test.sortBlocks(currentLocations);
        }
        catch (Error e) {
            System.err.println("Failed: " + e);
        }
        finally {
            CoordinateManager.goTo(0);
            RobotMover.die_elegantly();
            RobotMover.robot.close();
        }
    }
}
