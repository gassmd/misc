public class Student {

    private String studentName;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.studentName = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.studentName;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
        return this.studentName + " (" + this.studentNumber + ")";
    }
}