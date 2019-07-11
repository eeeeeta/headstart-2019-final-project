//in charge of the logic behind the block switching

public class BlockSwitcher {
    public static CoordinateManager coord = new CoordinateManager();

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
        coord.goTo((blockA * coord.DISTANCE_BETWEEN_BLOCKS) + (coord.DISTANCE_BETWEEN_BLOCKS / 2));
        System.out.println("* Switching");
        coord.swap();
    }
}
