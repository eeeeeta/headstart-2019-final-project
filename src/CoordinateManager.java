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
    public static double Blocks[] = {16.55,26.65,36.75,46.85};
    public static double Mids[] = {21.6,31.7,41.8};

    /**
     * Go to a given place on the coordinate grid.
     * @param newX x coordinate to move to
     */
    public static void goTo(double newX) {

        //receive new x value
        //compare current and new values
        //call either forward or backward
        //change current x value

        double DistanceTo = newX - x;
        System.out.println("Going to " + newX + ", delta " + DistanceTo);
        x = newX;
           if (DistanceTo > 0) {
               mover.forward(DistanceTo);
            }
            else if (DistanceTo < 0) {
                mover.backward(-DistanceTo);
        }
    }
}
