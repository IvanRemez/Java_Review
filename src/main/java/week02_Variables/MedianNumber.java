package week02_Variables;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        // a is median # between 3 DIFFERENT #s if
        // a < b AND a > c OR a > b AND a < c
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = (c < a && c > b) || (c < b && c > a);
        // OR cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is the median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is the median number");
        }
        if (cIsMedian) {
            System.out.println(c + " is the median number");
        }
    }
}
