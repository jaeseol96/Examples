import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initial Example
        // Person p = new Person("Jasmine", 20, 1234567);
        // Course c = new Course("Intro Programming 2", 1020, 100);
        // c.addStudent(p);
        // StudentGroup wics = new StudentGroup("WICS");
        // wics.addStudent(p);
        // c.printHeader();
        // c.printData();
        // wics.printHeader();
        // wics.printData();

        ArrayList<ITablePrintable> canJoins = new ArrayList<ITablePrintable>();
        canJoins.add(new Course("Intro Programming 2", 1020, 1));
        canJoins.add(new StudentGroup("WICS"));
        canJoins.add(new StudentGroup(".devClub"));
        canJoins.add(new StudentGroup("CSSA"));
        canJoins.add(new Course("Intro Programming 1", 1010, 1));

        IEnrollable temp = new StudentGroup("UMSU");
        IEnrollable temp1 = new Course("Data Structures", 2140, 1);
        for (ITablePrintable ie : canJoins) {
            printAllData(ie);
        }
    }

    public static void printAllData(ITablePrintable itp) {
        itp.printHeader();
        itp.printData();
    }
}