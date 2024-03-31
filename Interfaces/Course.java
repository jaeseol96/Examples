import java.util.ArrayList;

public class Course implements IEnrollable, ITablePrintable {
    private ArrayList<Person> classList;
    private String name;
    private int courseCode;
    private int capacity;

    public Course(String name, int courseCode, int capacity) {
        this.classList = new ArrayList<Person>();
        this.name = name;
        this.courseCode = courseCode;
        this.capacity = capacity;
    }

    @Override
    public void addStudent(Person p) {
        if (!classList.contains(p)) {
            classList.add(p);
        } else {
            System.out.println(p + " is already in the class.");
        }

    }

    @Override
    public String getName() {
        return courseCode + " - " + name;
    }

    @Override
    public void removeStudent(Person p) {
        Boolean removed = classList.remove(p);
        if (!removed) {
            System.out.println(p + " not in list.");
        }

    }

    public boolean isFull() {
        return getNumEnrolled() == capacity;
    }

    public String toString() {
        return courseCode + " - " + name;
    }

    @Override
    public int getNumEnrolled() {
        return classList.size();
    }

    @Override
    public void printHeader() {
        System.out.println("Course: " + getName());
    }

    @Override
    public void printData() {
        System.out.println("Students Registered:");
        if (classList.size() == 0)
            System.out.println("\tClass List is Empty");
        for (Person student : classList) {
            student.printData();
        }
    }

}
