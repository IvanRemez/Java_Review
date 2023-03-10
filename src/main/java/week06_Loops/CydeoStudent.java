package week06_Loops;

public class CydeoStudent {

    public String name, programmingLanguage, groupName;
    // no need to initialize because instance variables have default values
    public int age, batch;
    public char gender;
    public boolean isMarried, isEmployed;

    // public static String schoolName = "Cydeo";
    // static because it will be the same for all students (objects)
    // **Opposite of static is INSTANCE**


    public void setInfo(String name, String programmingLanguage, String groupName, int age, int batch, char gender, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.groupName = groupName;
        this.age = age;
        this.batch = batch;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                ", age=" + age +
                ", batch=" + batch +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying " + programmingLanguage);
    }
}
/*
In each object, user should be able to store the:
    name, age, gender, isMarried, batch, programming language, group name info
 */