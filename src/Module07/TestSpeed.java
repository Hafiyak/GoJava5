package Module07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 31.03.2017.
 */
public class TestSpeed {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<String> list3 = new LinkedList<>();
        List<Integer> list4 = new LinkedList<>();
        //final int elements = 1000000;

        //---------------------------add-----------------------------
       /* long startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list2.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> add speed: " + (endTime - startTime));


        //startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list1.add(i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> add speed: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list4.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> add speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list3.add(i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> add speed: " + (endTime - startTime));*/

//-----------------SET----------------------------------------------------------------
       /* startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list2.set(i,i);
        }
        // endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> set speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list1.set(i, i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> set speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list4.set(i, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> set speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list3.set(i, i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> set speed: " + (endTime - startTime));*/

//-----------------GET----------------------------------------------------------------
      /*  startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list2.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> get speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list1.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> get speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list4.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> get speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list3.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> get speed: " + (endTime - startTime));
        */

//-----------------REMOVE----------------------------------------------------------------
        /*startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list2.remove(elements - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> remove speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list1.remove(elements - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> remove speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list4.remove(elements - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> remove speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < elements; i++) {
            list3.remove(elements - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> remove speed: " + (endTime - startTime));
        */

    }
}
