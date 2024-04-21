public class UndergraduateStudent implements IStudent {
    private String name;
    private int studentNumber;
    private double gpa;

    public UndergraduateStudent(String name, int studentNumber, double gpa) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gpa = gpa;

    }

    @Override
    public double getGPA() {
        return gpa;
    }

    @Override
    public void printStudentInfo() {
        System.out.println("Name: " + name + "(" + studentNumber + "): Undergraduate");
    }

    @Override
    public int getStudentNumber() {
        return studentNumber;
    }
}
