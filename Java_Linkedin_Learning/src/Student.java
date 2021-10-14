import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int graduationYear;
    double studentGPA;
    String declaredMajor;

    public Student(String firstName, String lastName, int graduationYear,
                   double studentGPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.studentGPA = studentGPA;
        this.declaredMajor = declaredMajor;
    }
    public void incrementExpectedGraduationYear() {this.graduationYear = this.graduationYear +1;}
}



