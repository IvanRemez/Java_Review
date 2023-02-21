package week10_StaticVsInstance_Encapsulation;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    static public class Tire{
    // ^^ public and static order doesn't matter BUT class MUST come after them

        public String brand, size;
        public double price;
        //public static int number = 4;

    }


}
// ** INTERVIEW Q** Can class be Static?
        // - Yes, but only the nested Inner Class

class Q{
    public static void main(String[] args) {

    }
}
