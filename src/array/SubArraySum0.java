package array;

public class SubArraySum0 {
  public static void main(String[] args) {
    int arr1[]= {4,5,-4,-2,1};
	int arr2[] = {-10 ,-1 ,46 ,-27 ,-32 ,-5 ,-4, 1 ,-29, 5, 29 ,38 ,14 ,-22 ,-9,0};
	int arr[]= {10,-10};
   int flag=0;
   for (int i = 0; i < arr.length; i++) {
	   int currSum=arr[i];
	   
	   for(int j=i+1;j<arr.length;j++) {
		   if(currSum<0)
		   {
			   currSum=arr[j];
		   }
		    if(currSum==0) {
		       flag=1;
		       break;
		    }
		    currSum=currSum+arr[j];
	   }
   }
   if(flag==1) {
	   System.out.println("yes");
   }
   else
   {
	   System.out.println("no");
   }
}
}
