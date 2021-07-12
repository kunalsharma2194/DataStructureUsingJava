package array;

import java.util.*;
public class UnionAndIntersection {

	
	static void UnionIntersect(int arr1[],int arr2[]) {
	
		Map<Integer,Integer> m1=new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			m1.put(arr1[i],i);
		}
		for (int i = 0; i < arr2.length; i++) {
			m1.put(arr2[i],i);
		}
		for (Map.Entry<Integer, Integer>  s : m1.entrySet()) {
			System.out.print(s.getKey()+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Scanner sc=new Scanner(System.in);
//     int l1=sc.nextInt();
//     int l2=sc.nextInt();
//     int arr1[]=new int[l1];
//     int arr2[]=new int[l2];
//     for (int i = 0; i <l1; i++) {
//		arr1[i]=sc.nextInt();
//	}
//     for (int i = 0; i < l2; i++) {
//		arr2[i]=sc.nextInt();
//	}
     
     int arr1[] = { 1, 2, 5, 6, 2, 3, 5 };
     int arr2[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
     UnionIntersect(arr1,arr2);
	}

}
