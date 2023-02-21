package week07_Arrays;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D", "Java", "Python"}; // index: 0 - 5
        String[] arr2 = {"E", "F", "G"}; // index: 0 - 2

        String[] arr3 = new String[arr1.length + arr2.length];

        int j = 0; // j: for indexes of 3rd array
        // declared outside the loop, so you can reuse it in the 2nd loop when assigning
        // the 2nd array

        for (int i = 0; i < arr1.length; i++, j++) { // i: indexes of 1st array

            arr3[j] = arr1[i];  // j: indexes of 3rd array
            // elements of 1st array being assigned to indexes of 3rd array
        }
        for (int i = 0; i < arr2.length; i++, j++) { // i: indexes of 2nd array

            arr3[j] = arr2[i];
            //elements of 2nd array being assigned to 3rd array
        }
        System.out.println(Arrays.toString(arr3));


    }
}
/*
Tasks:
    Write a program that can merge two arrays of String and returns the third array

            Ex:
                String[] arr1 = {"A", "B", "C", "D"};
                String[] arr2 = {"E", "F", "G"};

            output:
               arr3 = {"A", "B", "C", "D", "E", "F", "G"};
 */