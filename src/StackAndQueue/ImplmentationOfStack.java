package StackAndQueue;

public class ImplmentationOfStack {
       private int maxSize;
       private long[] stackArray;
       private int top;
	   
       ImplmentationOfStack(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
       }
	   public void push(int a) {
	
		   stackArray[++top]=a;
		   
	   }
	   public long pop() {
		 long a = stackArray[top--];
         return a;
	   }
	   public boolean empty() {
		   return (top==-1);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ImplmentationOfStack m1=new ImplmentationOfStack(10);
      m1.push(10);
      m1.push(20);
      m1.push(30);
      m1.push(40);
      m1.push(50);
      
      while(!m1.empty())
      {
    	  long val=m1.pop(); 
    	  System.out.println(val);
    	  
      }
      
     
	}

}
