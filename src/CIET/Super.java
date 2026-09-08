package CIET;
//class Parent{
//	int x = 10;
//}
//class Child extends Parent{
//	int x = 20;
//	void show() {
	//	System.out.println(x);
//		System.out.println(super.x);
	//}
//}
//public class Super {
//public static void main(String[] args) {
	//Child c = new Child();
	//c.show();
//}
//}


class Parent{
	void display() {
		System.out.println("inside Parent");
	}
}
class Child extends Parent{
//	@override
 	void display() {
		System.out.println("inside child class");
		super.display();
	}
}


class Super{
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}