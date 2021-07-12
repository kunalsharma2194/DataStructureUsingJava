package StackAndQueue;

import java.util.Arrays;

public class ImplementationOfQueue {

	int front,rear,size;
	int capacity;
	public static int arr[];

	ImplementationOfQueue(int a){
		capacity=a;
		front=0;
		rear=capacity-1;
		arr=new int[capacity];
     }
	public void enque(int x) {
		arr[++rear]=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ImplementationOfQueue m1=new ImplementationOfQueue(10);
      m1.enque(100);
      m1.enque(200);
      m1.enque(300);
      m1.enque(400);
      
      System.out.println(Arrays.toString(arr));
	}
  
}
