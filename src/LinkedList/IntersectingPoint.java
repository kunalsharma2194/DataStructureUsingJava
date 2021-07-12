package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class IntersectingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list1=new ArrayList<>();
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
     list1.add(5);
     list1.add(6);
     list1.add(7);
     
     List<Integer> list2=new ArrayList<>();
     list2.add(10);
     list2.add(9);
     list2.add(8);
     list2.add(4);
     list2.add(5);
     list2.add(6);
     list2.add(7);
//     list2.add(8);
//     list2.add(4);
//     list2.add(5);
     
     int x=0;
     int flag=1;
     for (int i=0;i<list1.size();i++){
    	 if(flag==1)
    	 {
		for (int j=0;j<list2.size();j++) {
			if(list1.get(i)==list2.get(j))
			{
				List<Integer> sub=list2.subList(j,list2.size());
				if(list1.containsAll(sub)&&sub.get(0)==list1.get(i))
				{
					System.out.println(sub);
			         x=sub.get(0);
			         System.out.println(x);			         
			         flag++;
			         break;    
				}
			}
		 }
		
    	}
	}
	 
     

}
}