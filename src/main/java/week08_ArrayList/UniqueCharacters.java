package week08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        /*
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arr1);

         ^^ can be combined:
         */

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(arr1);

        arr1.removeIf(p -> Collections.frequency(arr1, p) > 1);
        System.out.println(arr1);


    }
}
/*
4. Write a program that can return the unique characters from a string

            DO NOT use:
                for loop, for each loop, while loop, do while loop
 */