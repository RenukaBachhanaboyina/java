package CIET;


	class Animals {
			void eat() {
				System.out.println("Animals eating");
			}
			}
	class Dog extends Animals{
				void bark(){
					System.out.println("Dog barks");
				}
			}
class Cats extends Animals{
		void meow(){
			System.out.println("moewing");
		}
}
class Inheritance2{
				public static void main(String[] args) {
					Dog D = new Dog();
					Cat c = new Cat();
					D.eat();
					D.bark();
					c.meow();
					c.eat();
				}				
	}

