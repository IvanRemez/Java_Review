package week03_IfAndSwitch;

public class SwitchStatement {

    public static void main(String[] args) {

        int day = 9;
        String result = "";

        switch (day){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                if (day < 1) {
                    result = "Minimum day number must be 1";
                } else {
                    result = "Maximum day number must be 7";
                }
        }
        System.out.println(result);
        System.out.println("----------------------------------------");

        int month = 5;

        if (month >= 1 && month <= 12){


        }else {
            System.out.println("Invalid");
        }

    }
}
