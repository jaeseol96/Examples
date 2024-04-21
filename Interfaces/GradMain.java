public class GradMain {
    public static void main(String[] args) {
        Advisor jae = new Advisor("Jae", 123456);
        UndergraduateStudent us = new UndergraduateStudent("Anmol", 123, 4.2);
        GraduateStudent gs = new GraduateStudent("Kyle", 4567, 3.6, jae);
        us.printStudentInfo();
        gs.printStudentInfo();
    }
}