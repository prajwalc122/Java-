class Student {
    String name;
	int age;

    // Constructor
    Student(String n,int a) 
	
	{
        name = n;
		age=a;
    }

    void display() {
        System.out.println("Name: " + name);
	}
	void show(){
		System.out.println("Age is :"+age);
    }
}

public class createcon{
    public static void main(String[] args) {
        Student s1 = new Student("prajwal c",18); // constructor is called here
        s1.display();
		s1.show();
    }
}