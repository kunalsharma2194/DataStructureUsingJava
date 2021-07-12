package SearchingAndSorting;

import java.util.Arrays;

public class FirstandLastOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1, 3, 5, 5, 5, 5, 7, 123, 125 };
   int k=7;
   for (int j = 0; j < arr.length; j++) {
	   if(arr[j]==k&&arr[j-1]!=k) {		   
		   System.out.println("First index of k:"+j);
	   }
	   if(arr[j]==k&&arr[j+1]!=k)
	   System.out.println("Last index of k:"+j);
    }
	}

}
