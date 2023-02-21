package week04_StringMethods;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby C++ Swift";

        int originalLength = sentence.length();

        String temp = sentence.replace("Java", "abc");

        int newLength = temp.length();

        System.out.println(sentence);
        System.out.println(temp); // all "Java" replaced with "abc" - one less char

        System.out.println(originalLength);
        System.out.println(newLength);

        int frequencyOfJava = originalLength - newLength;

        System.out.println("frequencyOfJava = " + frequencyOfJava);

        System.out.println("----------------------------------------");

        String s = "Python Python Python Python Python Python is cool!";

        String t = s.replace("Python", "spoon");

        int frequencyOfPython = s.length() - t.length();

        System.out.println("frequencyOfPython = " + frequencyOfPython);

        // SUMMARY:
        // "spoon" has one (1) less char than "Python";,
        // therefore,
        // old string length - new string length = # (number) of times Python appears

    }
}
/*
Challenge Task:
    1. Write a program that can return the frequency of the word "Java" from a sentence

                Ex:
                    sentence = "Java Java Java Java Python C# Ruby C++ Swift"

                    output: 4


            DO NOT implement any new topics (Loops, custom methods etc)
 */