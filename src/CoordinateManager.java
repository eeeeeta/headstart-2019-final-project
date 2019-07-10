//keeps track of the position (co-ords) of the blocks and the robot
import ShefRobot.*;

public class CoordinateManager {
    public static RobotMover mover = new RobotMover();
    // current x coordinate
    public static int x = 0;

    /**
     * Go to a given place on the coordinate grid.
     * @param go_x x coordinate to move to
     */
    public static void goTo(int go_x) {
    }

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
    public static ColorSensor.Color detectColor() {
        return mover.detectColor();
    }
}
