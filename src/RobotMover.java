import ShefRobot.*;
import lejos.utility.Delay;

public class RobotMover {
    public static Robot robot;
    public static ColorSensor sensor;
    public static Motor driveMotor;
    public static Motor armMotor;
    public static Motor spinMotor;

    public static void init() {
        robot = new Robot("G7");
        driveMotor = robot.getLargeMotor(Motor.Port.A);
        armMotor = robot.getLargeMotor(Motor.Port.B);
        spinMotor = robot.getMediumMotor(Motor.Port.C);
        sensor = robot.getColorSensor(Sensor.Port.S1);

        armMotor.rotateTo(90);
    }

    /**
     * Moves forward by `distance` units.
     *
     * @param distance How many units to move forward by.
     */
    public static void forward(int distance) {
    }

    /**
     * Moves backward by `distance` units.
     *
     * @param distance How many units to move backward by.
     */
    public static void backward(int distance) {
    }

    /**
     * Run the spinny switchy thingy once, swapping the two blocks
     * next to the robot.
     */
    public static void swap() {
        armMotor.rotateTo(-90);
        Delay.msDelay(2000);
        spinMotor.rotateTo(270);
        Delay.msDelay(2000);
        spinMotor.rotateTo(-90);
        Delay.msDelay(2000);
        armMotor.rotateTo(90);
    }
    /**
     * Detect the colour currently next to the robot.
     * @return the detected colour
     */
    public static ColorSensor.Color detectColor() {
        return sensor.getColor();
    }
}
