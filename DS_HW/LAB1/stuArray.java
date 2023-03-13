package LAB1;

import java.util.ArrayList;

public class stuArray {
    Student s;
    ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student x){
        students.add(x);
    }

    @Override
    public String toString() {
        return "Student " + students;
    }
}
