package seven_jan_friday;

public class palindrome_or_not_4 {
	public static void main(String[] args)
	{
		String name="nITIN";
		
		//int l=name.length();
		
		//char[] array=new char[l];
		
		char[] s=name.toCharArray();
		
		int n=s.length;
		
		int i=0,j=n-1;
		boolean palindrome_or_not= false;
		
		
		//System.out.println((name.equalsIgnoreCase(name)));
		
		while(i<=j)
		{  
			//if(s[i].equalsIgnoreCase(s[j]))
			{
			   if(s[i]!=s[j])
			  {
				palindrome_or_not=true;
			    break;
			  } 
				//i++;j--;
		}
		  if(palindrome_or_not)
		  {
			  System.out.print("palindrome");
		  }
		  else
		  {
			  System.out.print("not a palindrome");
		  }
		
		
		
	}

}
