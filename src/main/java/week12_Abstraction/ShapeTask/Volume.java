package week12_Abstraction.ShapeTask;

public interface Volume {

    boolean HAS_VOLUME = true;
    // FINAL VARIABLES preferred to be given in ALL CAPS

    double calc_volume();

    public static void shapesWithVolume(){
        System.out.println("ONLY 3D shapes have volume");
    }

    public default void method1(){
        System.out.println("Instance method of the child classes");
    }

}
