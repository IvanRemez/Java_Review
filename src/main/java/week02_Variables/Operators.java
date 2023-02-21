package week02_Variables;

public class Operators {

    public static void main(String[] args) {

        // Division

        System.out.println(20 / 3); // 6 Java drops the decimals
        System.out.println(20.0 / 3); // double variable given so decimals are kept
        System.out.println("-------------------------------------");

        // Remainder

        System.out.println(20 % 3);
        System.out.println(100 % 20);
        System.out.println("-------------------------------------");

        int x = 200;

        // x = x + 20;
        x += 20; //adding value to a variable on top of its original value

        System.out.println(x);

        int y = 200;
        y -= 50; // y = y - 50

        System.out.println(y);

        int score = 45;
        score *=2;

        System.out.println(score);

        int points = 100;
        points /= 2;

        System.out.println(points);
        System.out.println("----------------------------------------");

        int cents = 100;
        cents -= 60;

        System.out.println(cents);

        int quarter = cents / 25; // 1 quarter
        cents -= 25;
        System.out.println(cents);

        int nickels = cents / 5; // 3 nickels
        int remainingCents = cents % 1;
        cents %= 1;
        System.out.println("-----------------------------------------");

        int amount = 730;
        int hundreds = amount / 100; // 7.3

        System.out.println(hundreds);
        amount %= 100;

        System.out.println(amount);

        int tenth = amount / 10;
        System.out.println(tenth);

        tenth %= 10;
        //amount = amount % 10;
        System.out.println(tenth);
        System.out.println("----------------------------------------");

        System.out.println(-10 + 20);

        int q = 25;

        System.out.println(++q); // immediate increment +1 = 26
        System.out.println(q++); // keeps q at 26 an increases by 1 in following output

        int r = 50;

        System.out.println(r++); // 50
        System.out.println(r); // 51
        System.out.println("----------------------------------------");

        int t = 300;

        System.out.println(--t); // 299
        System.out.println(t--); // stays at 299, decreases by 1 after
        System.out.println(t); // 298

    }
}
