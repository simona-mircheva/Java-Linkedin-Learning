public class StudentProfiles {
    public static void main(String[] args) {
        Student studentA = new Student("Simon", "James", 2022, 3.4, "Finance");
        Student studentB = new Student("Maya", "Markovic", 2025, 4.0, "Biology");

        studentA.incrementExpectedGraduationYear();
        System.out.println(studentA.graduationYear);
    }
}
