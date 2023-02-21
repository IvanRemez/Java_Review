package week06_Loops;

public class NestedLoopPractice1 {

    public static void main(String[] args) {

        for (int m = 4; m >= 0; m--) { // outer loop - minutes remaining

            for (int s = 59; s >= 0; s--) { // inner loop - seconds remaining

                System.out.println(m + " minutes and " + s + " seconds");
            }

        }
    }
}
