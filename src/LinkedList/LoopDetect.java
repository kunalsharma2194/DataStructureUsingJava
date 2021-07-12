package LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
public class LoopDetect {
	
	static void Detect(LinkedList<Integer> l1,int x) {
		
		if(x==0)
		{
			System.out.println(false);
		}
		else if(x==(l1.size()-1))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Integer> l1=new LinkedList<>();
      Scanner sc=new Scanner(System.in);
      int l=sc.nextInt();
      int count=0;
      while(count!=l)
      {
	   l1.add(sc.nextInt());
	   count++;
      }
      int x=sc.nextInt();
      Detect(l1,x);
	}

}
