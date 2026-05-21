public class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class based{
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Anita", 22);

        s1.display();   // Name: Rahul, Age: 20
        s2.display();   // Name: Anita, Age: 22
    }
}