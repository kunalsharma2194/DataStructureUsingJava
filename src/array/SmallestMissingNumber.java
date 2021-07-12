package array;

import java.util.Scanner;

public class SmallestMissingNumber {

	static void MissingNumber(int arr[],int m,int n) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==i)
			{
				count++;
				if(i==arr[n-1]&&count==n-1)
				{
					System.out.println(i+1);
					break;
				}	
				continue;
			}
			else 
			{
				if(arr[i]<m)
				{
					System.out.println(i);
				}
				
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n,m;
      n=sc.nextInt();
      m=sc.nextInt();
      int arr[]=new int[n];
      for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		}
      MissingNumber(arr,m,n);
	}

}
