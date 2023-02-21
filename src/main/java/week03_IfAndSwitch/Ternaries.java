package week03_IfAndSwitch;

public class Ternaries {

    public static void main(String[] args) {

        int day = 9;
        String result = "";

        if (day >= 1 && day <= 7){
            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ?
                    "Wednesday" : (day == 4) ? "Thursday" : (day == 5) ? "Friday" :
                    (day == 6) ? "Saturday" : "Sunday";
        }else {
            result = (day < 1) ? "Minimum day number is 1" : "Maximum day number is 12";
        }
        System.out.println(result);
        System.out.println("----------------------------------------");

        int day1 = 9;
        String result1 = "";

        result1 = (day1 >= 1 && day1 <= 7) ?
                (day1 == 1) ? "Monday" : (day1 == 2) ? "Tuesday" : (day1 == 3) ?
                        "Wednesday" : (day1 == 4) ? "Thursday" : (day1 == 5) ? "Friday" :
                        (day1 == 6) ? "Saturday" : "Sunday"
                : "Invalid";

        System.out.println(result1);

    }
}
