/* In Java, visibility modifiers (also called access modifiers) control where classes, methods, variables, and constructors can be accessed from.

Java has 4 visibility levels:

Modifier	Same Class	Same Package	Subclass (Different Package)	Everywhere
private	✅	❌	❌	❌
(default/package-private)	✅	✅	❌	❌
protected	✅	✅	✅	❌
public	✅	✅	✅	✅
*/
class Car{
    private int speed = 100;

    public static void main(){
        System.out.println(speed);
    }
}