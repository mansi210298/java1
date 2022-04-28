package seven_jan_friday;
import java.util.Scanner;

public class string_into_char_array_using_user_input_2 {
	public static void main(String[]args)
	{
		Scanner SC =new Scanner(System.in);
		System.out.print("string name:");
		
		String name=SC.nextLine();
		int n=name.length();
		SC.close();   //for SC work completed
		
		char[] array= new char[n];
		int i;
		for( i=0;i<array.length;i++)    //method 1 by loop
		{
			array[i]=name.charAt(i);
			System.out.print(array[i]);
		}
		
		System.out.println();
		
		System.out.println(n);    //for length display
		
		
		char[] s=name.toCharArray();    //method 2
		
		for(i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		
	
	}

}
