class Student{        //class is a collection of objects
    int id = 101;
    String name = "Prajwal";

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Classes{
    public static void main(String[] args) {
        Student s1 = new Student(); // Object creation
        s1.display();
    }
}