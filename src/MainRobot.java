//parent class of robot to define attributes and some methods


import ShefRobot.*;

public class MainRobot {

    public static void main(String[] args) {
        Sorter test = new Sorter();

        int[] currentLocations = new int[4];
        //where currently red yellow blue green
        // has array [3,4,1,2]
        currentLocations[0] = 3;
        currentLocations[1] = 4;
        currentLocations[2] = 1;
        currentLocations[3] = 2;

        test.sortBlocks(currentLocations);

    }
}
