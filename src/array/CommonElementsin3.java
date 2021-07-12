package array;
import java.util.*;
import java.util.Map.Entry;
public class CommonElementsin3 {

	static void commonElements(int arr1[],int arr2[],int arr3[]) {
		int arr[]= {1, 5, 10, 20, 40, 80,6, 7, 20, 80, 100,3, 4, 15, 20, 30, 70, 80, 120};
		HashMap<Integer,Integer> m1=new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
		
	     int key=arr[i];
	     
	     if(m1.containsKey(key)) {
	    	 int freq=m1.get(key);
	    	 freq++;
	    	 m1.put(key,freq);
	     }
	     else
	     {
	    	 m1.put(key,1);
	     }
		}
		
		
		
		for (Entry<Integer, Integer> val : m1.entrySet()) {
			if(val.getValue()==3)
			System.out.println(val.getKey()+" "+val.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[]={1, 5, 10, 20, 40, 80};
      int arr2[]={6, 7, 20, 80, 100};
      int arr3[]={3, 4, 15, 20, 30, 70, 80, 120};
 
      commonElements(arr1,arr2,arr3);
	}

}
