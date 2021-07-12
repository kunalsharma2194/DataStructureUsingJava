package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionOfSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list1=new ArrayList<>();
     list1.add(6);
     list1.add(5);
     list1.add(4);
     list1.add(3);
     list1.add(2);
     list1.add(1);
     Collections.sort(list1);
     List<Integer> list2=new ArrayList<>();
     list2.add(8);
     list2.add(6);
     list2.add(4);
     list2.add(2);
     Collections.sort(list2);
     for (Integer item1 : list1) {
          for (Integer item2 : list2) {
        	  {
        		  if(item1==item2) {
        			  System.out.print(item1+" ");
        			  break;
        		  }
        	  }
		}		
	}
	}

}
