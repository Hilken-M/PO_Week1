/*
This will be the driver and setup to test the Intersection and Loop Detection coding challenges presented
in the Project On-boarding Week 5/1/22 - 5/7/22. Each coding challenge direction is included at the top of
the relevant class.


 */

import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        //Set up collections and insert data into them:
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(3);



        //run Intersection method to check if there is an intersection between two supplied lists

        //modify lists to change intersecting node from index 5 value 6, to index 6 value 7 of list1
        list2.set(5, 10);

        //re-run Intersection method to check if there is an intersection between two supplied lists

        //run LoopDetection method to check and see if the list supplied has a loop

        //modify list to change index 5 value 3 to index 5 value 6
        list3.set(5, 6);

        //re-run LoopDetection method to check and see if the loop was removed from the supplied list

    }

}
