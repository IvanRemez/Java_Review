package week03_IfAndSwitch;

public class FINRA {

    public static void main(String[] args) {

        // add precondition for number to be POSITIVE and

        int num = 17;

        if (num > 0) { // FIN, RA, FINRA

            if (num % 3 == 0 && num % 5 == 0) {
                // false && true ==> false
                System.out.println("FINRA");
            } else if (num % 3 == 0) {
                System.out.println("FIN");
            } else if (num % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(num);
            }
        } else { // INVALID
            System.out.println("Invalid");
        }
        System.out.println("----------------------------------------");

        int day = 9;
        String result = "";

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                result = "Monday";
            } else if (day == 2) {
                result = "Tuesday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }
        } else { // day # is INVALID - day needs to be < 1 and > 7
            if (day < 1) {
                result = "Minimum day number must be 1";
            } else {
                result = "Maximum day number must be 7";
            }
        }
        System.out.println(result);

    }
}
/*
6. Create a class called FINRA, Write a function which prints out the number.
but for number which is a multiple of 3, print "FIN" instead of the number
and for number which is a multiple of 5, print "RA" instead of the number.
and for number which is a multiple of both 3 and 5, print "FINRA" instead of
the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA
 */