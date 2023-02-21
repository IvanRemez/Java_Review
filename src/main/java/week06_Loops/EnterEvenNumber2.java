package week06_Loops;

import java.util.Scanner;

public class EnterEvenNumber2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;

        /*while (num % 2 != 0){
            System.out.println("Enter an even number:");
            num = input.nextInt();
        }

         */

        do {
            System.out.println("Enter an even number:");
            num = input.nextInt();
        }while (num % 2 != 0);

        System.out.println("Even number: " + num);
    }
}
