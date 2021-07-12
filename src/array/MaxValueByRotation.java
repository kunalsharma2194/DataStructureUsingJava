package array;

import java.util.*;

public class MaxValueByRotation {

	public void Rotate(int arr[],int r)
	{
		int l=arr.length;
		int temp;
		for(int i=0;i<r;i++)
		{
			temp=arr[0];
           for(int j=0;j<l-1;j++) {
        	   arr[j]=arr[j+1];
           }
           arr[l-1]=temp;
		}
		sum(arr);
	}
	public void sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		  sum+=arr[i]*i	;
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(sum);

	}
	public static void main(String[] args) {
		MaxValueByRotation a=new MaxValueByRotation();
	    int arr[]={1,20,2,10};
	    int r=2;
		a.Rotate(arr,r);
	}
}
