package seven_jan_friday;

import java.util.Scanner;

public class number_of_occurence_of_character_in_string_by_user_input_5 {
	
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);  // helloMansi
	 System.out.println("Enter the string:");
	 String name=sc.nextLine();
	 
	// int l=name.length();
	
	 System.out.print("Enter the character in string:");
	 char character=sc.nextLine().charAt(0);
	 sc.close();
	 
	 //char[] array=new char[l];
	 
	  char[] s=name.toCharArray();
	 
	 int i=0,count=0;
	 boolean found=false;
	 
	 while(i<s.length)
	 {
		 if(s[i]==character)
	    {
		     found=true;
		     count++;
	    
	    }
	    i++;
	    
	 }
	 if(found==true)
	 {
		 System.out.println(count);
	 }
	 else {
		 System.out.print("no character present like this!!!!");
	 }
	 
	 
 }
}
