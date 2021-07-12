package array;

import java.util.*;

public class ElementsAtLeastTwoGreaterElements {

	 static void GreaterElements(int arr[]) {
	  int count;
//	  Arrays.sort(arr);
		 for (int i = 0; i < arr.length; i++) {
	    	count=0;
	    	for (int j = 0; j < arr.length; j++) {
	    		if(arr[i]<arr[j])
	    		{
	    			count++;
	    			if(count>=2)
	    			{
	    				System.out.print(arr[i]+" ");
	    				break;
	    			}
	    		}
			}
	  }	
	 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      int arr[]=new int[s];
      for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
      GreaterElements(arr);
	}

}
