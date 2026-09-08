package CIET;
class Code1 {
	static String college = "ciet guntur";
	String name;
	int age;
	public static void main(String[] args) {
		Code1 student1 = new  Code1();
		Code1 student2 = new  Code1();
		student1.name = "renu";
		student1.age = 21;
		student2.name = "ravi";
		student2.age = 25;
		System.out.println("student1 name: " + student1.name);
		System.out.println("student1 age: " + student1.age);
		System.out.println("student2 name: " + student2.name);
		System.out.println("student2 age: " + student2.age);
		System.out.println("student1 college: " + student1.college);
	}
	
}
