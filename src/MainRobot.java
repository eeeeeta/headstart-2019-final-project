//parent class of robot to define attributes and some methods


import ShefRobot.*;

public class MainRobot {

    public static void main(String[] args) {
        System.out.println("Connecting to robot");
        RobotMover.init();
        System.out.println("Connection established.");
        try {
            Sorter test = new Sorter();

            //int[] currentLocations = ColourDetector.detectColours();
            int[] currentLocations = {4, 1, 3, 2};
            test.sortBlocks(currentLocations);
        }
        catch (Error e) {
            System.err.println("Failed: " + e);
        }
        finally {
            RobotMover.robot.close();
        }
    }
}
