package CIET;

class Animals {
		void eat() {
			System.out.println("Animals is eating");
		}
		}
class Dogs extends Animals{
			void bark(){
				System.out.println("Dog barks");
			}
		}
		class Inheritance1{
			public static void main(String[] args) {
				Dog D = new Dog();
				D.eat();
				D.bark();
			}				
}