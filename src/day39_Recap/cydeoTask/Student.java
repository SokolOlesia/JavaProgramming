package day39_Recap.cydeoTask;

public class Student extends Person{

    private  int studentID;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", studentID='" + getStudentID() + '\'' +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                '}';
    }
}
