//sorter class implements bubble sort for the blocks and returns instructions for the roobot

import java.util.ArrayList;


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

        int changes = 0;
        ArrayList<int> switches = new ArrayList<int>();

        do {
            //compare
            //call switch blocks
            for (int i = 0; i<3; i++) {

                if (blockOrder[0] > blockOrder[1]) {
                    switches.add(i);

        } while (changes != 0);

        /*

        while (changes == 0) {
            int changes = 0; //changes made in one pass ie if no changes, sorted and break loop
            int[] switches = new int[]; //keep list of changes needing to be physically made

            for (int i = 0; i<3; i++) {

                if (blockOrder[0] > blockOrder[1]) {
                    int temp = blockOrder[0];



                }



            }
        }
    */

        //output is loop calling blockswitcher for each switch
    }




}
