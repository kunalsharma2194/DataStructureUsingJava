package StackAndQueue;
import java.util.Queue;
import java.util.*;
public class ReverseQueue {

	static void Reverse(Queue<Integer> q) {
		Queue<Integer> q1=new LinkedList<>();
		Stack<Integer> a=new Stack();
		
		while(!q.isEmpty()) {
			a.push(q.element());
			q.remove();
		}
//		System.out.println(a);
        while(!a.isEmpty()) {
        	q1.add(a.pop());
        }
        System.out.println(q1);
	}
	public static void main(String[] args) {
	ReverseQueue m1=new ReverseQueue();
	Queue<Integer> q=new LinkedList<>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);
	q.add(6);
	q.add(7);
	q.add(8);
	q.add(9);
	q.add(10);
	System.out.println(q);
	Reverse(q);
    }
}
