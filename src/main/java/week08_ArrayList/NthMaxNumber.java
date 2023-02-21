package week08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 5;

        System.out.println(list);
        /*
        list.removeIf(p -> p == Collections.max(list)); // removes max number - 8
        System.out.println(list);

        list.removeIf(p -> p == Collections.max(list)); // removes 2nd max number - 7
        System.out.println(list);

        list.removeIf(p -> p == Collections.max(list)); // removes 3rd max number - 6
        System.out.println(list);

        list.removeIf(p -> p == Collections.max(list)); // removes 4th max number - 5
        System.out.println(list);

        5th max number is 4
         */

// in order to remove the Nth max number, we can remove the first (n-1) max numbers using fori loop
        for (int i = 0; i < n - 1; i++) {

            list.removeIf(p -> p == Collections.max(list));
        }
        System.out.println(list);

        int result = Collections.max(list);
// then the next max number will be the Nth max number

        System.out.println("result = " + result);


    }
}
/*
3. write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,8,8}
                n = 5
            output:
                4
 */