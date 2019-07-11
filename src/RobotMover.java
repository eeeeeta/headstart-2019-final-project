import ShefRobot.*;
import lejos.utility.Delay;

public class RobotMover {
    public static Robot robot;
    public static ColorSensor sensor;
    public static Motor driveMotor;
    public static Motor armMotor;
    public static Motor spinMotor;


    public static double WHEEL_DIAMETER = 5.6;
    public static void init() {
        robot = new Robot("192.168.138.56");
        driveMotor = robot.getLargeMotor(Motor.Port.A);
        armMotor = robot.getLargeMotor(Motor.Port.B);
        spinMotor = robot.getMediumMotor(Motor.Port.C);
        sensor = robot.getColorSensor(Sensor.Port.S1);

        spinMotor.setSpeed(100);
        armMotor.setSpeed(100);
        armMotor.rotateTo(90);
        spinMotor.rotateTo(90);
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
        System.out.println("Swapping!");
        armMotor.rotateTo(0);
        spinMotor.rotate(-270);
        System.out.println("Restoring arm");
        spinMotor.rotate(90);
        armMotor.rotateTo(90);
        spinMotor.rotate(180);
    }
    /**
     * Detect the colour currently next to the robot.
     * @return the detected colour
     */
    public static ColorSensor.Color detectColor() {
        return sensor.getColor();
    }
}
