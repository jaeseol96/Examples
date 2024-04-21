import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        students.add(new Student("Alex", 1239));
        students.add(new Student("Alex2", 1234));
        students.add(new Student("Alex3", 1235));
        students.add(new Student("Alex4", 1236));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }
}