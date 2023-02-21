package week10_StaticVsInstance_Encapsulation;

public class Data {

    public int a;

    public static int b;

    public Data(int a) {
        this.a = a;
    }

    static {
        b = 100;
    }

}


class Test {

    public static void main(String[] args) {

        Data data1 = new Data(20);

        Data data2 = new Data(30);

        System.out.println(data1.a); // 20
        System.out.println(data1.b); // 100 - static variable

        System.out.println(data2.a); // 30
        System.out.println(data2.b); // 100

    }
}
