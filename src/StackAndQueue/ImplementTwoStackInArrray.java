package StackAndQueue;

import java.util.Arrays;

public class ImplementTwoStackInArrray {

	   static int[] arr;
	   int size;
	   int top1,top2;
	public ImplementTwoStackInArrray(int l) {
    		size=l;
    		arr=new int[l];
            top1=l/2;
            top2=l/2;
		
	}
	public void push1(int a) {
		arr[--top1]=a;
	}
	public int  pop1() {
		int rm=arr[top1++];
		return rm;
	}
	public int  pop2() {
		int rm=arr[top2--];
		return rm;
	}
	public void push2(int b) {
		arr[++top2]=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ImplementTwoStackInArrray h=new ImplementTwoStackInArrray(7);
    h.push1(2);
    h.push1(3);
    h.push2(4);
    h.push2(7);
    h.push1(11);
    h.push2(9);
    System.out.println(Arrays.toString(arr));
    System.out.println(h.pop2());  
    
	}

}
