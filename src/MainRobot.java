//parent class of robot to define attributes and some methods


import ShefRobot.*;

public class MainRobot {

    public static void main(String[] args) {
        RobotMover.init();

        for(int i = 0; i < 10; i++) {
            RobotMover.forward(30.6);
            RobotMover.backward(30.6);
        }
        RobotMover.robot.close();
    }
}
