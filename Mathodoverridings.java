// Parent class (superclass)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (subclass)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Mathodoverridings{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();          // Animal makes a sound

        Dog d = new Dog();
        d.sound();          // Dog barks

        // Polymorphism:
        Animal ref = new Dog();
        ref.sound();        // Dog barks (Dog's version is used)
    }
}