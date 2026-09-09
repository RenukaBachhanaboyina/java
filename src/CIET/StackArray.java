package CSE3;

public class StackArray {
	private int[] Stack;
	private int top;
	private int capacity;
	StackArray(int capacity){
		this.capacity = capacity;
		Stack = new int[capacity];
		top = -1;
	}
	void push(int value) {
		if(top == capacity - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		Stack[++top] = value;
	}

	int pop() {
		if(isEmpty()) {
			System.out.println("Stack Overflow");
			return -1;
		}
		return Stack[top];
	}
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return Stack[top];
	}
	boolean isEmpty() {
		return top == -1;
	}
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(Stack[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackArray stack = new StackArray(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		System.out.println("Top: " + stack.peek());
		System.out.println("Popped: " + stack.pop());
		stack.display();
	}
}
	