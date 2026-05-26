import java.util.ArrayList;

public class StudentNames{

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Prajwal");
        students.add("Rahul");
        students.add("Anjali");

        System.out.println("Student Names:");

        for(String name : students) {
            System.out.println(name);
        }
    }
}