package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
public class ReverseGivenSize {

	static void Reverse(LinkedList<Integer> l1,int x) {
	
	 Stack<Integer> s1=new Stack<Integer>();
	 Stack<Integer> s2=new Stack<Integer>();
		while(l1.size()!=x)
		{
			s1.add(l1.removeLast());
		}
		
		while(!l1.isEmpty()) {
			s2.add(l1.remove());
		}
		
		while(!s2.isEmpty()){
			l1.add(s2.pop());
		}
		
		while(!s1.isEmpty()) {
			l1.add(s1.pop());
		}
		System.out.println(l1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<Integer> l1=new LinkedList<>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    l1.add(5);
      
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    Reverse(l1,x);
    }

}
