package CIET;

public class overload {
void add(int a) {
	System.out.println(a);
}
void add(double a) {
	System.out.println(a);
}
void add(int b,int c) {
	System.out.println(b + c);
}
void add(int b,double c) {
	System.out.println(b + c);
}
public static void main(String[] args) {
	overload o = new overload();
	o.add(12);
	o.add(12.5);
	o.add(12,5);
}
}
