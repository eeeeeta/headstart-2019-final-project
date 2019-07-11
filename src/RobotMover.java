import ShefRobot.*;

public class RobotMover {
    public static Robot robot;
    public static ColorSensor sensor;
    public static Motor driveMotor;
    public static Motor armMotor;


    public static double WHEEL_DIAMETER = 5.6;
    public static void init() {
        robot = new Robot("G7");
        driveMotor = robot.getLargeMotor(Motor.Port.A);
        armMotor = robot.getLargeMotor(Motor.Port.B);
        sensor = robot.getColorSensor(Sensor.Port.S1);
    }

    /**
     * Moves forward by `distance` units.
     *
     * @param distance How many units to move forward by.
     */
    public static void forward(double distance) {
        double totalTachos = (360.0 * distance) / (Math.PI * WHEEL_DIAMETER);
        double tachosTravelled=0 ;
        driveMotor.resetTachoCount();
        while (tachosTravelled<totalTachos){
            driveMotor.forward();
            tachosTravelled=tachosTravelled+(driveMotor.getTachoCount());
        }


    }

    /**
     * Moves backward by `distance` units.
     *
     * @param distance How many units to move backward by.
     */
    public static void backward(double distance) {
    }

   /* private static double cmsToTachos(double cms) {
        return (360.0 * cms) / (Math.PI * WHEEL_DIAMETER);
    }
    */

    /**
     * Run the spinny switchy thingy once, swapping the two blocks
     * next to the robot.
     */
    public static void swap() {

    }
    /**
     * Detect the colour currently next to the robot.
     * @return the detected colour
     */
    public static ColorSensor.Color detectColor() {
        return sensor.getColor();
    }
}
