package ten_jan_monday;
import java.util.*;

public class longest_commom_prefix_type_4 {
	
	public static void main(String[] args)
	{
		String[] a= {"geeks","geekster","gee"};
		
	//	System.out.println(lcp(array));
		lcp(a);
	}
	
	public static void lcp(String[] a)
	{
		int size=a.length;  //that is size = 3
		
		//if size is 0, print empty string
		if(size==0)
		{
			System.out.println("null string");
		}
		
		//if element is only one so needs no comparision
		if(size==1)
		{
			 System.out.println(a[0]);
		}
		System.out.println(a);  //therefore used line 30 plz run
		
		Arrays.sort(a);    //it required a header file;  //for sorting an array
		
		System.out.println(Arrays.toString(a));
		
		// find the minimum length from first and last string
		int end_till=Math.min(a[0].length(), a[size-1].length());
		
		System.out.println(end_till);    //print is only for checking the step wise result
		
		  /* find the common prefix between the first and
        last string */
		
		int i=0;
		String result="";
		while(i<end_till   &&    a[0].charAt(i)==a[size-1].charAt(i))
		{
			i++;
			
			 result=a[size-1].substring(0,i);	
		}
		System.out.println(result);
		
	}

}
