package GoldManSachs;

public class Stack {
	private int top;
	private int capacity;
	private int arr[];
	
	Stack(int size) {
		arr = new int[size];
		top=-1;
		capacity= size;
	}
	
	private void push(int element) {
		if(isFull()) {
			System.out.println("Stack overflow.");
			System.exit(1);
		}
		
		System.out.println("Inserting " +element);
		arr[++top] = element;
	}
	
	private int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow.");
			System.exit(1);
		}
		int x = arr[top--];
		//arr[top+1] = 0;
		return x;
	}
	
	private int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow.");
			System.exit(1);
		}
		int x = arr[top];
		//arr[top+1] = 0;
		return x;
	}
	
	private int getSize() {
		return top +1;
	}
	private boolean isFull() {
		return top == capacity + 1;
	}
	
	private boolean isEmpty() {
		return top == capacity -1;
	}
	
	private void print() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(5);

	    stack.push(1);
	    stack.push(2);
	    stack.push(3);

	    System.out.println("Stack: ");
	    stack.print();

	    // remove element from stack
	    System.out.println("peek = " + stack.peek());
	    stack.pop();
	    System.out.println("\nAfter popping out");
	    stack.print();
	}

}
