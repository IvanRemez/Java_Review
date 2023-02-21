package week04_StringMethods;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char ch = str.charAt(1);

        int length = str.length();

        System.out.println(ch);
        System.out.println(length);

        int lastIndex = str.length() - 1;

        char ch2 = str.charAt(lastIndex);

        System.out.println(ch2);
        System.out.println("----------------------------------------");

        int indexOfE = str.indexOf('e');

        System.out.println("indexOfE = " + indexOfE);

        int indexOfFirstO = str.indexOf("o");

        System.out.println("indexOfFirstO = " + indexOfFirstO);

        int indexOfSecondO = str.indexOf("oo");

        System.out.println("indexOfSecondO = " + indexOfSecondO);
        System.out.println("----------------------------------------");

        String s1 = "BATCH 28"; // every String Object in Heap is IMMUTABLE

        s1.toLowerCase(); // this creates a NEW OBJECT -> new String: "batch 28"

        System.out.println("s1 = " + s1);
        System.out.println("----------------------------------------");

        String s2 = "I live in Virginia, I love Virginia";

        //s2 = s2.replace("Virginia", "New York");
        // ^^^^^ MUST assign for new string to be printed

        //s2 = s2.replaceFirst("Virginia", "New York");
        // can also replace 2nd (2) Virginia but adding more specifics to the ""
        s2 = s2.replaceFirst("e Virginia", "e New York");

        System.out.println(s2);
        System.out.println("----------------------------------------");

        String s3 = "Batch 28 students";

        String t1 = s3.substring(0, 8);

        System.out.println(t1);

        String t2 = s3.substring(s3.indexOf('s'));

        System.out.println(t2);
        System.out.println("----------------------------------------");

        String name = "mUhTaR";

        // name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        name = ("" + name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
        //      ^^ converts to String, so you can use charAt() - since char uses String

        System.out.println(name);
        System.out.println("----------------------------------------");

        String a = "yEs";

        System.out.println(a.equals("yes")); // false - Case Sensitivity
        System.out.println(a.equalsIgnoreCase("yes")); // true

        // .equals() - used for OBJECTS only
        // .equalsIgnoreCase() - used for STRING only
        System.out.println("----------------------------------------");

        String l = "Today we will have Java and Soft Skills classes";

        boolean hasSelenium = l.contains("Selenium"); // false
        boolean hasJava = l.toLowerCase().contains("java"); // case sensitivity - true

        System.out.println("hasSelenium = " + hasSelenium);
        System.out.println("hasJava = " + hasJava);






    }
}
