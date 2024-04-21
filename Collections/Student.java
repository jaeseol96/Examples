
public class Student implements Comparable<Student> {
    private String name;
    private int studentNumber;

    public Student(String name, int num) {
        this.name = name;
        studentNumber = num;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentNumber - o.studentNumber;
    }

    public String toString() {
        return "Name: " + name + " (" + studentNumber + ")";
    }

}