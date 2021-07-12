package LinkedList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;
public class RemoveDuplicate {

	static void Remove(LinkedList<Integer> l1) {
		Stack<Integer> s1=new Stack<>();
		
		Iterator<Integer> it = s1.iterator();
		
		while(!l1.isEmpty()) {
			if(s1.isEmpty()) {
				s1.add(l1.remove());
			}
			else
			{
//				while(it.hasNext()) {
//					if((it.next()).equals(l1.getFirst())) {
//					break;	
//					}
//					else
//					{
//						s1.add(l1.remove());
//					}
//				}
			}
		}
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer> l1=new LinkedList<>();
     l1.add(2);
     l1.add(2);
     l1.add(4);
     l1.add(5);
     Remove(l1);
	}

}
