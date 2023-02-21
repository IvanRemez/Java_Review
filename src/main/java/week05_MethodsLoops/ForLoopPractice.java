package week05_MethodsLoops;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // make sure this is OUTSIDE the loop
                                                // to avoid repetition

        /*
        System.out.println("Enter a number:");
        scan.nextInt();

        System.out.println("Enter a number:");
        scan.nextInt();

        System.out.println("Enter a number:");
        scan.nextInt();

         */

        int max = -2147483648;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt(); // 1, 2, 3, 4, 5

            if (num > max){
                max = num;  // constantly replacing max with the greater #
            }
        }
        scan.close();

        System.out.println("max = " + max);
    }
}
