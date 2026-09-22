package CSE4;

 
public class NthNodeFromEnd {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	int findNthNodeFromEnd(int n) {
		Node first = head;
		Node second = head;
		for(int i = 0;i < n;i++) {
			if(first == null) {
				throw new IllegalArgumentException("Invald n");
			}
			first = first.next;
		}
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		return second.data;
	}
}
