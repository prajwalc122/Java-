class Mathod{

    // Method 1: adds two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds three numbers (same name, extra parameter)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Mathode{
    public static void main(String[] args) {
        Mathod m = new Mathod();

        int sum1 = m.add(5, 10);        // calls add(int, int)
        int sum2 = m.add(1, 2, 3);      // calls add(int, int, int)

        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
    }
}