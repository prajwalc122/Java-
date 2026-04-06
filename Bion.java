import java.io.*;

class Student {
    String name;
    int age;
    String course;

    // Constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(name+ " " + age + " " + course);
    }
}

public class Bion{
    public static void main(String[] args) {
        Student s1 = new Student("Prajwal", 20, "BCA");
        s1.display();
    }
}