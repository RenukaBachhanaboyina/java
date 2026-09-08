package CIET;

public class method3 {
double ciet(int a,int b,double c){
	return a+b+c;
}
public static void main(String[] args) {
	method3 l = new method3();
	double a = l.ciet(12,34,99.9);
	System.out.println(a);
}
}
