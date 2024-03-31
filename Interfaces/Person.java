public class Person implements ITablePrintable {
    private String name;
    private int age;
    private long studentNumber;

    public Person(String name, int age, long studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getStudentInfo() {
        return name + " (" + studentNumber + ")";
    }

    public boolean equals(Person p) {
        return this.studentNumber == p.studentNumber;
    }

    public String toString() {
        String result = "Name: " + name;
        result += "\nAge: " + age;
        result += "\nStudent Number: " + studentNumber;
        return result;
    }

    @Override
    public void printHeader() {
        System.out.println(getStudentInfo());
    }

    @Override
    public void printData() {
        System.out.println("\t" + name + "\t(" + studentNumber + ")");
    }
}
