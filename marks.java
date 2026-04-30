class Student {
    private int marks;   // private data (hidden)

    // setter method
    public void setMarks(int m) {
        marks = m;
    }

    // getter method
    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setMarks(85);  // setting value
        System.out.println("Marks: " + s.getMarks()); // getting value
    }
}