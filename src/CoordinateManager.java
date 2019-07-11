/*
# How the coordinate system works

- The point on the robot where the switching arm is is where all measurements
  are taken from.
- Coordinate 0 is when the arm (and colour sensor) is directly in line with
  the first block.
 */
import ShefRobot.*;

public class CoordinateManager {
    public static RobotMover mover = new RobotMover();
    // current x coordinate
    public static double x = 0;
    public static int Blocks[] = new int[4];
    public static int Mids[] = new int[3];

    public static double DISTANCE_BETWEEN_BLOCKS = 20;

    /**
     * Go to a given place on the coordinate grid.
     * @param go_x x coordinate to move to
     */
    public static int goTo(double newX) {
        //receive new x value
        //compare current and new values
        //call either forward or backward
        //change current x value

        double DistanceTo = newX - x;
        x = newX;
           if (DistanceTo > 0) {
               mover.forward(DistanceTo);
            }
            else if (DistanceTo < 0) {
                mover.backward(DistanceTo);
        }
    }


    //COULD CALL THESE DIRECTLY FROM BLOCKSWITCHER
    /**
     * Run the spinny switchy thingy once, swapping the two blocks
     * next to the robot.
     */
    public static void swap() {
        mover.swap();
    }
    /**
     * Detect the colour currently in front of the robot.
     * @return the detected colour
     */

    //DO NOT TOUCH
    public static ColorSensor.Color detectColor() {
        return mover.detectColor();
    }
}
