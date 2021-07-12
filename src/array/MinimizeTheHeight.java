package array;
import java.util.*;
public class MinimizeTheHeight {

	static void Height(int arr[],int k) {
		int half=(arr.length)/2;
		for (int i = 0; i < arr.length; i++) {
		
           if(i<half)
           {
				arr[i]+=k;
           }
			else if(i>=half) {
				
				if(arr[i]-k<=0) {
					arr[i]+=k;
				}
				else
				{
				arr[i]-=k;
				}
			}
		}
//        for (int i = 0; i < arr.length; i++) {
//			if(i<half) {
//				arr[i]+=k;
//			}
//			else if(k>=half){
//				arr[i]-=k;
//			}
//		}
		System.out.println(Arrays.toString(arr));
     	Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int ans=arr[arr.length-1]-arr[0];
//		System.out.println(Arrays.toString(arr));
		System.out.println(ans);
}
	public static void main(String[] args) {
		int arr[]= {1,10,14,14,14,15};
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Height(arr,k);
	}
}
