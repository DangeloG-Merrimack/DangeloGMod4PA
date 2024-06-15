import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program is used to create and add integers in
 * sorted order to a linked list. It will ultimately 
 * print the linked list for the user to see. 
 * None of this code is reused, it is the first iteration.
 * 
 * @author Giovanni D'Angelo
 * @version 1.0
 * @since   Week 4 of CSC6301
 */
public class DangeloGMod4PA {
    /**
     * Main function to run program.
     * Will create an array to test the linked list
     * sorting and adding. Will call on method to add
     * in a new number. Will print out final linked list.
     * 
     * @param args Default variable for main - not used.
     * @since Week 4 of CSC6301
     */
    public static void main(String[] args){
        //Base list of integers to be used in linked list.
        int[] baseList = {78, 34, 12, 93, 14, 44};
        //Created linked list to manage.
        LinkedList<Integer> llist = new LinkedList<Integer>();

        //Iterate through the length of baseList.
        for(int i = 0; i < baseList.length; i++){
            //Call method to add integer into linked list.
            addInt(llist, baseList[i]);
        }

        //Print out original list and final ordered linked list.
        System.out.println("Original list: " + Arrays.toString(baseList));
        System.out.println("Final linked list: " + llist);
    }

    /**
     * Method to add integers to linked list in order. 
     * Will use ListIterator to go through the linked list. 
     * 
     * @param tempList Linked list used to input integers.
     * @param n Number to be added to the linked list.
     * @since Week 4 of CSC6301
     */
    public static void addInt(LinkedList<Integer> tempList, int n){
        //Set up iterator for linked list.
        ListIterator<Integer> it = tempList.listIterator();
        
        //If nothing exists in linked list add n.
        if(! it.hasNext()){
            it.add(n);
        }
        //Continue to iterate linked list until end.
        while(it.hasNext()){
            //Set p to be the element in linked list.
            int p = it.next();

            //Once element is larger than new number,
            //you will put in n to previous spot.
            if(p > n){
                it.previous();
                it.add(n);
                break;
            //If iteration hits the end of the linked list,
            //you will place n at the end of list.
            }else if(! it.hasNext()){
                it.add(n);
                break;
            }
        }
    }
}
