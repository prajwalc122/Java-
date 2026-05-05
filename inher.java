class Animal 
{
	void sound(){
	System.out.println("Animal is make sound");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("Dog do work with barks");
	}
}
public class inher{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		d1.bark();
		d1.sound();
	}
}
