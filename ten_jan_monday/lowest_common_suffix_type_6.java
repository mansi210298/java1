package ten_jan_monday;
import java.util.*;

import java.util.Arrays;

public class lowest_common_suffix_type_6 {
	public static void main(String[] args)
	{
		String[] suffix= {"banvana","lvlvana","avana"};
		int size =suffix.length;  //3
		
		if(size==0)
		{
			System.out.println("null string");
		}
		
		if(size==1)
		{
			System.out.println(suffix[0]);
		}
		
		Arrays.sort(suffix);
		
		System.out.println(Arrays.toString(suffix));
		
		int end=Math.min(suffix[0].length(),suffix[size-1].length());
		System.out.println(end);
		
	  int i=0;
	  int j=suffix[0].length();
	
	     while(i<=j)
		{
			System.out.println(suffix[0]);
		}
		
		
		
	}

}
