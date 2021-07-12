package StackAndQueue;

import java.util.Arrays;

 public class Queue {
  
   
	int front=0;
	int rear,size;
	int capacity;
	
   static int[] arr;
	
	Queue(int l)
	{
		
		front=size;
	    rear= capacity-1;
		capacity=l;
		arr=new int[l];
	}
   
	public void enqueue(int a) {
		
		this.rear=(this.rear+1) % this.capacity;
		arr[rear]=a;
		size=size+1;
	}
	
	public void dequeue() {
		int item=arr[front];
		front=(front+1)%capacity;
		size=size-1;
		System.out.println(item);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue m1=new Queue(5);
    m1.enqueue(10);
    m1.enqueue(20);
    m1.enqueue(30);
//    m1.enqueue(40);
//    m1.enqueue(50);
    m1.enqueue(60);
    m1.enqueue(70);
    
    System.out.println(Arrays.toString(arr));
    m1.dequeue();
    m1.dequeue();
    System.out.println(Arrays.toString(arr));
	}


}
