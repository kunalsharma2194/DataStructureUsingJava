package LinkedList;
import java.util.LinkedList;
import java.util.Stack;
public class ReverseLinkedList {

	static void Reverse(LinkedList<Integer> l1) {
		Stack<Integer> a1=new Stack<>();
		while(!l1.isEmpty())
		{
		a1.push(l1.remove());
		}
	
		while(!a1.isEmpty()) 
		{ 
			l1.add(a1.pop()); 
		}
		
		System.out.println(l1);
		
	}
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);
		Reverse(l1);
	}
}
