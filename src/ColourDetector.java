import ShefRobot.ColorSensor;

/**
 * Detects the colours of all the blocks at the very start.
 */
public class ColourDetector {
    public static CoordinateManager coord = new CoordinateManager();

    /**
     * Detect the colours of the blocks, at the very start of the program,
     * and return a list of which order the blocks are in.
     *
     * @return
     */
    public static int[] detectColours() {
        System.out.println("** Detecting colours");
        int[] ret = new int[4];
        int current_pos = 0;
        for (int i = 0; i < 4; i++) {
            int col = detectColour();
            System.out.println("* Detected block in position " + i + " as block #" + col);
            ret[i] = col;
            current_pos += coord.DISTANCE_BETWEEN_BLOCKS;
            coord.goTo(current_pos);
        }
        return ret;
    }
    private static int detectColour() throws Error {
        ColorSensor.Color col = coord.detectColor();
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
