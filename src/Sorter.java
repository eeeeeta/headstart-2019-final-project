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
     * @param blockOrder Which order the blocks are in.
     */
    public static void sortBlocks(int[] blockOrder) {


        //switches is dynamic array holding index of first block to be switches
        //ie a switch will switch the block referenced and the block after
        ArrayList<Integer> switches = new ArrayList<Integer>();

        //run a loop for every pass made
        //ie would be n-1 for any possible length
        //used 3 here for 4 possible blocks to sort
        for (int pass = 0; pass<3; pass++) {

            //loop to compare each block with the block after
            //0 indexed so runs for i = 0,1,2
            //no need to compare last block as has no block after
            //makes every comparison (i) needed in one pass
            for (int i = 0; i<3; i++) {

                //if blocks need to be switched
                if (blockOrder[i] > blockOrder[i+1]) {

                    //switch blocks
                    int temp = blockOrder[i];
                    blockOrder[i] = blockOrder[i+1];
                    blockOrder[i+1] = temp;

                    //keep record of changes made
                    //by appending index of first block
                    switches.add(i);
                }
            }
        }

        //loop to call blockswitcher class to switch blocks
        //once running, will need to test no 0 indexing errors in loop
        //but fairly confident is correct
        for (int i = 0; i<switches.size(); i++) {
            switcher.switchBlocks(switches.get(i));

        }
        //output is loop calling blockswitcher for each switch
    }




}
