package CIET;

class Animales {
		void eat() {
			System.out.println("Animals is eating");
		}
		}
class Dogs extends Animales{
			void bark(){
				System.out.println("Dog barks");
			}
		}
class Cat extends Dogs{
	void meow() {
		System.out.println("cat meows");
	}
}
class Rat extends Cat{
	void hide() {
		System.out.println("rat hides");
	}
}
class multiple{
			public static void main(String[] args) {
				Rat r = new Rat();
				r.eat();
				r.bark();
				r.meow();
				r.hide();
			}				
}