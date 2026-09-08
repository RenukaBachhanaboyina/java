package CIET;
interface Greeting{
	void sayHello();
}
public class Exp1 {
public static void main(String[] args) {
	Greeting g = () -> System.out.println("Hello");
	g.sayHello();
}
}
