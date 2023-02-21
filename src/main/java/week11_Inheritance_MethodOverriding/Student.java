package week11_Inheritance_MethodOverriding;

public class Student extends Person{

    private String studentID, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentID,
                   String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                super.toString() +
                ", studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
/*
3. Create a subclass of Person named Student
            Extra variables:
                studentId, fieldOfStudy, schoolName, grade

            Encapsulate all the fields
                restrictions:
                    fieldOfStudy can not

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
                toString()
 */