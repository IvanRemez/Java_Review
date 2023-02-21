package week08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"};

        // convert Array to List:
        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));

        System.out.println(names);

        // names.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
        // names.removeIf(p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length() - 1));
        // ^^ alternative solutions

        names.removeIf(p -> (p.charAt(0) + "").equalsIgnoreCase(p.charAt(p.length() - 1) + ""));
        // "" concatenation used to convert Char to String

        System.out.println(names);
        System.out.println("-----------------------------------------------");

        // converting ArrayList to Array:

        // arr = names.toArray(new String[10]); // new Array created and size specified (MUST)
        // extra spaces will be null
        arr = names.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // int[] numbers = nums.toArray(new int[0]); // doesn't work
        Integer[] numbers = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers)); // must be NON PRIM (object) to be converted

        int[] a1 = {10,20,30,40};   // a1 array must be Integer object (NON PRIM) to convert to ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : a1) {
            list.add(each);
        }

        System.out.println(list);

    }
}
/*
2. Write a program that can remove string elements from an arraylist if the first and
last characters of the string are same

    ex:
        list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
    output:
        ["Lan", "Ebrahim", "Farida"]
 */