package week08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayListPractice {

    // *** IMPORTANT LESSON *** INSERTION/DELETION OF ELEMENTS IN ARRAYLIST FOCUS***

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        list.add(10); // everytime you add or remove an element you get a new array (object) of elements
        list.add(10);

        System.out.println(list);

        System.out.println(list.size());

        // need to add: 30, 40, 60, 90

        list.addAll(Arrays.asList(30, 40, 60, 90));
        System.out.println(list);

        // 45, 65, 75

        list.addAll(3, Arrays.asList(45, 65, 75));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        // remove 45, 40, 90

        list.removeAll(Arrays.asList(45, 40, 90));
        System.out.println(list);

        list.remove(Integer.valueOf(75));
        System.out.println(list);
        System.out.println("-----------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>(list);
        // numbers.addAll(list); // can pass directly ^^ when creating new ArrayList

        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500));
        System.out.println(numbers);

        // keep elements: 65, 300, 400

        numbers.retainAll(Arrays.asList(65, 300, 400));
        System.out.println(numbers);
        System.out.println("-----------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "SoftSkill", "Selenium", "API", "SQL", "Wooden Spoon"));

        System.out.println(names);

        // names.charAt --> type is ArrayList NOT String

        names.get(2).charAt(2);
        // .get() method gives you the literal String = can use string methods
        System.out.println("-----------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 50, 10, 20, 30, 40, 50));
        System.out.println(nums);

        nums.removeIf( p -> p < 40); // lambda expression - shortest function
        System.out.println(nums);

        System.out.println(new LinkedHashSet<>(nums));


    }
}
