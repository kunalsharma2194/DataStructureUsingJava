package array;
import java.util.*;
public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
		int arr[]=new int[l];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
