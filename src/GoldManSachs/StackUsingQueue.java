package GoldManSachs;

import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private int top;
	
	public void push(int x) {
		q1.add(x);
		top = x;
	}

	public int pop() {
	    while (q1.size() > 1) {
	        top = q1.remove();
	        q2.add(top);
	    }
	    int poped = q1.remove();
	    Queue<Integer> temp = q1;
	    q1 = q2;
	    q2 = temp;
	    return poped;
	}
	
	public void print() {
		if(q1.size() > 0) {
			System.out.println(q1);
		} else {
			System.out.println(q2);
		}
	}
	
	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println("popped = "+s.pop());
		s.print();
		
	}
}
