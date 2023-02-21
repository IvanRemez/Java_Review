package week03_IfAndSwitch;

public class IfStatements1 {

    public static void main(String[] args) {

        // Odd or Even
        int num = 100;

        /* NOT GOOD PRACTICE
        if (num % 2 != 0){
            System.out.println("Odd number");
        }

        if (num % 2 == 0){
            System.out.println("Even number");
        }

         */

        if (num % 2 != 0){
            System.out.println("Odd number");
        }else {
            System.out.println("Even number");
        }
        System.out.println("----------------------------------------");

        // 28 days, 30 days, 31 days
        
        int month = 30;

        if (month >= 1 && month <= 12){ // if month is VALID
            if (month == 2){
                System.out.println("28 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 days");
            }else {
                System.out.println("31 days");
            }
        }else { // if month is INVALID
            System.out.println("Invalid");

            if (month < 1){
                System.out.println("Minimum month number is 1");
            }else {
                System.out.println("Maximum month number is 12");
            }
        }
        System.out.println("----------------------------------------");



    }
}
