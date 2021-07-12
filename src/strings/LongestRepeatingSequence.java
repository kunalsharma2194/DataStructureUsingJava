package strings;
import java.util.*;
public class LongestRepeatingSequence {

	static void longest(String s) {
	 char[] s1;
	 int count=0;
		HashMap<Character,Integer> map=new HashMap<>();
	     s1 =s.toCharArray();
		int l=s.length();
		
		for (int i = 0; i < l; i++) {
         	if(map.isEmpty())
				map.put(s1[i],1);
         	else if(map.containsKey(s1[i])) {
         	map.put(s1[i],map.get(s1[i])+1);
         	}
         	else
         	{
         		map.put(s1[i],1);         		
         	}
//			map.put(s1[i], map.get(s1[i])+1);
		}
	   Integer max=Collections.max(map.values());
	   System.out.println(max);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="axxxy";
    longest(s1);
	}

}
