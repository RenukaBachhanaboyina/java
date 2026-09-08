package CIET;

public class method {
int dog(int a,int b) {
	return a + b;
}
public static void main(String[] args) {
	method l = new method();
	int a = l.dog(10,20);
	System.out.println(a);
}
}
