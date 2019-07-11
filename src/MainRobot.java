//parent class of robot to define attributes and some methods


import ShefRobot.*;

public class MainRobot {

    public static void main(String[] args) {
        RobotMover.init();
        try {
            Sorter test = new Sorter();

            int[] currentLocations = {3, 2, 4, 1};
            //where currently red yellow blue green
            // has array [3,4,1,2]
            //test.sortBlocks(currentLocations);
            RobotMover.swap();
        }
        catch (Error e) {
            System.err.println("Failed: " + e);
        }
        finally {
            RobotMover.robot.close();
        }
    }
}
