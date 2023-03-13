package LAB1;

public class Question2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmed Maresh",11);
        Student s2 = new Student("Lionel Messi",30);
        Student s3 = new Student("Neymar JR",10);

        stuArray arr = new stuArray();
        arr.addStudent(s1);
        arr.addStudent(s2);
        arr.addStudent(s3);
        System.out.println(arr.toString());
    }
}
