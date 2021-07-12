package array;
import java.util.*;

public class RotationCount {
    
      static void rotationCount(int arr[],int len) {
		int temp=arr[len-1];
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(temp<arr[i])
				count++;
		}
		System.out.println(temp);
		System.out.println(count);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RotationCount rot=new RotationCount();
       Scanner sc=new Scanner(System.in);
       int len=sc.nextInt();
       int arr[]=new int[len];
       for(int i=0;i<len;i++) {
          arr[i]=sc.nextInt();
       }
       rotationCount(arr,len);
	}

}
