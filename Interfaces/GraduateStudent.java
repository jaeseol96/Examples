public class GraduateStudent implements IStudent {
    private String name;
    private int studentNumber;
    private double gpa;
    private Advisor advisor;

    public GraduateStudent(String name, int studentNumber, double gpa, Advisor advisor) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gpa = gpa;
        this.advisor = advisor;
        advisor.adviseNewStudent(this);
    }

    @Override
    public double getGPA() {
        return gpa;
    }

    @Override
    public void printStudentInfo() {
        System.out.println("Name: " + name + "(" + studentNumber + "): Graduate\n\t" + advisor);
    }

    @Override
    public int getStudentNumber() {
        return studentNumber;
    }

}
