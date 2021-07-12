package array;
import java.util.*;
	
public class KthSmallestArray {

	static void SmallestKth(int arr[],int x) {
	Arrays.sort(arr);
	// It uses Tuned Quicksort with
    // avg. case Time complexity = O(nLogn)
	
	System.out.println(Arrays.toString(arr));	
	System.out.println("Samlest element of array is: "+arr[0]);	
	if(arr[0]!=arr[x-1])
	{
		System.out.println(x+" smallest is :"+arr[x-1]);			
	}
	else
	{
		System.out.println(x+" smallest is :"+arr[x]);					
	}
	}
	public static void main(String[] args) {	
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int x=sc.nextInt();
    int arr[]=new int[s];

    for(int i=0;i<s;i++) {
	  arr[i]=sc.nextInt();
    }
    SmallestKth(arr,x);
	
	}
}
