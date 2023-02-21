package week07_Arrays;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D"};
        String[] arr2 = {"E", "F", "G"};

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0; // for indexes of 3rd array

        for (String each : arr1) { // each - elements of 1st array

            arr3[k++] = each; // each element of 1st array being assigned to each index
            // of 3rd array
        }

        for (String each : arr2) { // each - elements of 1st array

            arr3[k++] = each; // each element of 1st array being assigned to each index
            // of 3rd array
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