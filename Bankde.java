class Bank{
    String name;
	int years;

    // Constructor
    Student(String n,int y) 
	
	{
        name = n;
		years=y;
    }

    void display() {
        System.out.println("Name: " + name);
	}
	void show(){
		System.out.println("Age is :"+years);
    }
}

public class Bankde{
    public static void main(String[] args) {
        Student s1 = new Student("SBI",33); // constructor is called here
        s1.display();
		s1.show();
    }
}