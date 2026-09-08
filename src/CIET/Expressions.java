package CIET;
interface Message{
	void   show(String msg);
}
public class Expressions {
public static void main(String[] args) {
	Message m= (msg) -> System.out.println(msg);
	m.show("hello");
}
}   