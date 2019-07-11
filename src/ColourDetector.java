import ShefRobot.ColorSensor;

/**
 * Detects the colours of all the blocks at the very start.
 */
public class ColourDetector {
    /**
     * Detect the colours of the blocks, at the very start of the program,
     * and return a list of which order the blocks are in.
     *
     * @return
     */
    public static int[] detectColours() throws Error {
        System.out.println("** Detecting colours");
        int[] ret = new int[4];
        RobotMover.spinMotor.rotateTo(-90);
        for (int i = 0; i < 4; i++) {
            double pos = CoordinateManager.Blocks[i];
            int j = 0;
            for (; j < 10; j++) {
                int col = 0;
                CoordinateManager.goTo(pos);
                try {
                    col = detectColour();
                    System.out.println("* Detected block in position " + i + " as block #" + col);
                    ret[i] = col;
                    break;
                } catch (Error e) {
                    System.out.println("* Detection failed, going along a bit");
                    pos += 1.0;
                }
            }
            if (j == 5) {
                throw new Error("* Failed to find colour");
            }
        }
        RobotMover.spinMotor.rotateTo(90);
        return ret;
    }
    private static int detectColour() throws Error {
        ColorSensor.Color col = RobotMover.detectColor();
        switch (col) {
            case RED:
                return 3;
            case BLUE:
                return 1;
            case GREEN:
                return 2;
            case YELLOW:
                return 4;
            default:
                throw new Error("Invalid or nonexistent colour");
        }
    }
}
