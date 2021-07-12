package array;
import java.util.*;
public class factorialOfLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,fact=1;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(n>0) {
    	   fact=fact*(n--);
       }
       System.out.println(fact);
	}

}
