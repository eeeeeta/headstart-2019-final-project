//sorter class implements bubble sort for the blocks and returns instructions for the roobot

public class Sorter {
    public static BlockSwitcher switcher = new BlockSwitcher();

    /**
     * Given a list specifying which order the blocks are in,
     * issue commands to the BlockSwitcher to sort the blocks
     * into the correct order (i.e. [1, 2, 3, 4]).
     *
     * For example, this might be called as sortBlocks([3, 4, 1, 2]),
     * and it would then run bubblesort and issue commands to the
     * BlockSwitcher to switch the blocks back into [1, 2, 3, 4] order.
     *
     * @param block_order Which order the blocks are in.
     */
    public static void sortBlocks(int[] blockOrder) {

        //take int array of unsorted numbers
        //loop for every pass
        //in each loop compare item and item after
        //temp variable to switch values

        while (true) {
            int switches = 0;

            for (int i = 0; i<3; i++) {




            }
        }


        //output is loop calling blockswitcher for each switch
    }
}
