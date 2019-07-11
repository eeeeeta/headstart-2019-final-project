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

        //changes stores changes per pass,

        ArrayList<Integer> switches = new ArrayList<Integer>();
        int changes = 0;

        for (int pass = 0; pass<3; pass++) {


            changes = 0;
            //compare
            //call switch blocks
            for (int i = 0; i<3; i++) {

                if (blockOrder[i] > blockOrder[i+1]) {

                    System.out.println("i: " + i);
                    int temp = blockOrder[i];
                    blockOrder[i] = blockOrder[i+1];
                    blockOrder[i+1] = temp;
                    switches.add(i);
                    changes = changes + 1;
                }
            }
        }


        //this loop isn't running
        for (int i = 0; i<switches.size(); i++) {
            System.out.println("i: " + i + " Switch" + switches.get(i) + " and " + (switches.get(i)+1));

        }
        //output is loop calling blockswitcher for each switch
    }




}
