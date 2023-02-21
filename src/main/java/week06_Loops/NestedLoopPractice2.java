package week06_Loops;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        String s = "abcabcabcabcbbbbbbxy";

        String result = "";

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j); // checking each char from string
            int f = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == ch){ // checking each char in string against each char
                    // in string ( i == j -> increase frequency by 1)
                    f++;
                }
            }

            /*
            if (result.contains("" + ch)){
                continue;
            }
            result += ch + "" + f;

             */

            if (f==1){
                result += ch;
            }
        }
        System.out.println(result);


    }
}
