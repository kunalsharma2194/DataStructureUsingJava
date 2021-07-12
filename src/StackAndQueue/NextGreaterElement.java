package StackAndQueue;

import java.util.Scanner;

public class NextGreaterElement {

	 void nextGreater(int arr1[]) {
		for (int i = 0; i < arr1.length; i++) 
		{
			int gt=-1;
			for (int j = i+1; j < arr1.length; j++) {				
			if(arr1[i]<arr1[j])
			{
		      gt=arr1[j];
		      System.out.print(gt+" ");
		      break;
			}
			else
			{
				continue;
			}
		}
		    if(gt ==-1)
			{
				System.out.print("-1"+" ");
			}
	  
       }
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		NextGreaterElement m1=new NextGreaterElement();
        int[] arr= {11,13,21,3};
		m1.nextGreater(arr);
	}

}
