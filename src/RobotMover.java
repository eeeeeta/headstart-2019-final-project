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
        driveMotor.setSpeed(75);
        spinMotor.setSpeed(100);
        armMotor.setSpeed(100);
        spinMotor.rotateTo(90);
        armMotor.rotateTo(90);
    }
    public static void die_elegantly() {
        spinMotor.rotateTo(0);
        armMotor.rotateTo(0);
    }
    /**
     * Moves forward by `distance` units.
     *
     * @param distance How many units to move forward by.
     */
    public static void forward(double distance) {
        move(distance, true);
    }

    /**
     * Moves backward by `distance` units.
     *
     * @param distance How many units to move backward by.
     */
    public static void backward(double distance) {
        move(distance, false);
    }

    private static void move(double distance, boolean forward) {
        double tachos = cmsToTachos(distance); //converts distance in cm into tachos
        System.out.println("Going " + distance + "cm, which is " + tachos + " tachos");
        driveMotor.resetTachoCount(); //set tacho count to zero again
        driveMotor.forward(); //robot moves forward
        if (!forward) { //if forward=false ie robot is moving backwards, tachos becomes negative (so robot moves in reverse)
            tachos = -tachos;
        }
        driveMotor.rotateTo((int) tachos);
        System.out.println("Apparently, we traveled " + driveMotor.getTachoCount() + " tachos");
        driveMotor.stop();
    }
    private static double cmsToTachos(double cms) {
        // There are pi * WHEEL_DIAMETER cms in 360 tachos.
        // Therefore, 1 cm represents 360 / (pi * WHEEL_DIAMETER) tachos.
        return (360.0 * cms) / (Math.PI * WHEEL_DIAMETER);
    }


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
