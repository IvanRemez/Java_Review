package week06_Loops;

import java.util.Scanner;

public class EnterEvenNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an even number:");
        int num = input.nextInt();

        while (num % 2 != 0){

            System.err.println(num + " is not an even number, please re-enter");
            num = input.nextInt();
         // ^^ reassigns new num input and checks condition again
         // ^^ MUST include
        }

        System.out.println("Even number: " + num);
    }
}
