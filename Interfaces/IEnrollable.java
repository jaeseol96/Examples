//add student to course
//remove from list
//get the name of class

public interface IEnrollable {
    void addStudent(Person p); // add student if not already in class

    void removeStudent(Person p); // remove student or prints does not exist

    String getName(); // return string of enrollable data type

    int getNumEnrolled();

}
