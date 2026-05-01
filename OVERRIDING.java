/*THIS IS MADE UP WITH METHOD OVERRIDING.*/
class A {
    void display() {
        System.out.println("A");
    }
}
class B extends A {
    void display() {
        System.out.println("B");
    }
}
public class OVERRIDING{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}