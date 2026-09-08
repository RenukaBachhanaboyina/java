package CIET;

class Animal {
void eat() {
	System.out.println("Animal is eating");
}
void sleep() {
	System.out.println("sleeping");
}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Dog barks");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}
class Inheritance{
	public static void main(String[] args) {
		Dog D = new Dog();
		D.eat();
		D.bark();
		D.sleep();
	}
}