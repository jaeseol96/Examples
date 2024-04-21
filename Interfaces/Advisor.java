import java.util.List;

public class Advisor {
    private String name;
    private int employeeNumber;
    private List students;

    public Advisor(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.students = new StudentList();
    }

    public void adviseNewStudent(IStudent student) {
        students.add(student);
    }

    public void studentGraduates(IStudent student) {
        // find student graduating
        // if undergrad congratulate on bachelor, graduate for graduate

        System.out.println("Not yet implemented");
    }

    public String toString() {
        String returnString = "Advisor's Name: " + name + "(" + employeeNumber + ")";
        return returnString;
    }
}
