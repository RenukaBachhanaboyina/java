package CSE4;

public class InsertAtBeginning {
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
		
	void insertAtBegin(int data) {
		Node newNode = new Node(data);
			
		newNode.next = head;
		
		head = newNode;
	}
	void display() {
		Node current = head;
			
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		InsertAtBeginning list = new InsertAtBeginning();
			
		list.insertAtBegin(30);
		list.insertAtBegin(20);
		list.insertAtBegin(10);
		list.insertAtBegin(5);
			
		list.display();
	}
}