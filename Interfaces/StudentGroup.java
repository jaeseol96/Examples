import java.util.ArrayList;

public class StudentGroup implements IEnrollable, ITablePrintable {
    private String name;
    private ArrayList<Person> members;

    public StudentGroup(String name) {
        this.name = name;
        this.members = new ArrayList<Person>();
    }

    @Override
    public void addStudent(Person p) {
        if (!members.contains(p)) {
            members.add(p);
        } else {
            System.out.println(p + " is already a member.");
        }
    }

    @Override
    public void removeStudent(Person p) {
        if (!members.contains(p)) {
            System.out.println(p + " is not a member.");
        } else {
            members.remove(p);
        }
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumEnrolled() {
        return members.size();
    }

    @Override
    public void printHeader() {
        System.out.println("Student group name: " + getName());
    }

    @Override
    public void printData() {
        System.out.println("Members:");
        if (members.size() == 0)
            System.out.println("\tNo members currently.");
        for (Person p : members) {
            p.printData();
        }
    }
}
