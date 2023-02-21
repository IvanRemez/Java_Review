package week04_StringMethods;

import java.util.Scanner;

// import java.lang.String;     IMPLICITLY imported as part of basic Java

public class TestStringObjects {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        String str1 = new String("Java"); // Heap

        String str2 = "Java"; // String Pool

        System.out.println(str1 == str2);
            // NEVER use "==" because it checks if objects are the same
            // even if the String is the same, they are 2 different objects

        System.out.println(str1.equals(str2)); // use .equals() instead

        System.out.println("----------------------------------------");

        String s1 = "Batch 28";
        String s2 = "Batch 28";
            // only ONE (1) object created in String Pool
            // identical objects in the Pool are never duplicated
            // every identical object references back to the original

        System.out.println(s1 == s2);

        String s3 = new Scanner(System.in).nextLine(); // new keyword "Batch 28"
            // now == doesn't work - must use .equals()

        System.out.println(s2 == s3); // false
        System.out.println(s2.equals(s3)); // true

        // ** String Pool is ONLY for LITERALS
        // Java Heap is for everything else like Scanner input - new keywords

        System.out.println("----------------------------------------");

        String a1 = "Wooden Spoon";
        String a2 = "Wooden Spoon";
        String a3 = "Wooden Spoon";
        String a4 = "Wooden Spoon";
        String a5 = "Wooden Spoon";

        String b1 = new String("Wooden Spoon");
        String b2 = new String("Wooden Spoon");
        String b3 = new String("Wooden Spoon");
        String b4 = new String("Wooden Spoon");
        String b5 = new String("Wooden Spoon");




    }
}
