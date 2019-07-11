//in charge of the logic behind the block switching

public class BlockSwitcher {
    /**
     * Swaps the order of two blocks, the first of which is `blockA`.
     *
     * For example, switchBlocks(0) swaps blocks 1 and 2.
     * switchBlocks(1) swaps blocks 2 and 3.
     *
     * @param blockA The number of the first block to be swapped.
     */
    public static void switchBlocks(int blockA) {
        System.out.println("** Switching block in position " + blockA + " with " + (blockA + 1));
        System.out.println("* Moving robot to between blocks");
        CoordinateManager.goTo(CoordinateManager.Mids[blockA]);
        System.out.println("* Switching");
        RobotMover.swap();
    }
}
