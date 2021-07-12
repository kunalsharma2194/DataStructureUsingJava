package array;

public class KadenesAlgorithm {

	static void maxSumArray(int arr[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
   
		for (int i = 0; i < arr.length; i++) {
			currSum+=arr[i];
			if(currSum>maxSum) {
				maxSum=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		System.out.println(maxSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr1[]= {5,-4,-2,6,-1};
         int arr2[]= {1,2,3,-2,5};
         int arr[]= {-1,-2,-3,-4};
         maxSumArray(arr);
	}

}
