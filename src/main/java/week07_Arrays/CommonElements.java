package week07_Arrays;

public class CommonElements {

    public static void main(String[] args) {

        String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift", "Java"};
        String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};

        String result = "";

        for (String element : arr1) { // element - each element of 1st array

            for (String each : arr2) { // each - each element of 2nd array

                if (each.equals(element)){ // if element of 1st array is included in 2nd array
                    System.out.println(each); // print each match
                }
            }
        }

        /*
        for (String each : arr2) {

            if (each.equals(element2)){
                System.out.println(each);
            }
        }
         */

    }
}
/*
    Write a program that can display the common elements from two arrays of string

            Ex:
                String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
                String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};

            Output:
                Java
                Wooden Spoon
 */