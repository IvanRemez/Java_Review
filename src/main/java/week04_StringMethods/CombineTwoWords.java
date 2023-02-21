package week04_StringMethods;

public class CombineTwoWords {

    public static void main(String[] args) {

        String s1 = "one";
        String s2 = "eight";

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {

            // ^^ if last character of first string is equal to the
            // first character of the last string
            System.out.println(s1 + s2.substring(1));

        }else {
            System.out.println(s1 + s2);

        }

    }
}
/*
6. Create a class named CombineWords. Ask user to enter two words. Then add them
together and print.

    But if the last letter if the first word and the first letter of the last
    letter is the same, print that character once.
                Input:
                    one
                    eight
                Output:
                    oneight
 */