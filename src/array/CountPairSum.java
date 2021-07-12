package array;

import java.util.HashMap;

public class CountPairSum {
 
	static void getPairCount(int sum, int arr[]) {
		
		HashMap<Integer,Integer> m1= new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!m1.containsKey(arr[i])) {
				m1.put(arr[i],0);
			}
			
			m1.put(arr[i], m1.get(arr[i])+1);
			
		}
		int twiceCount=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(m1.get(sum-arr[i])!=null)
				twiceCount +=m1.get(sum-arr[i]);
			
			
			if(sum-arr[i] ==arr[i])
				twiceCount--;
		}
		
		System.out.println(twiceCount/2);
	}
	
	public static void main(String[] args) {
     
	 int arr[]= {1, 5, 7, 1};
	 int sum=6;
	 getPairCount(sum,arr);
}
	
}
