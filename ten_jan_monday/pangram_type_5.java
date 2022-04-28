package ten_jan_monday;

public class pangram_type_5 {
	public static void main(String[] args)
	{
		String s="A quick brown fox jumps over the lazy dog";
		
		boolean[] mark=new boolean[26];
		int index=0;
		boolean pangram=true;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				index=s.charAt(i)-'A';
			}
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				index=s.charAt(i)-'a';
			}
			
			mark[index]=true;
		}
		
		for(int i=0;i<mark.length;i++)
		{
			if(mark[i]==false)
				pangram=false;
		}
		
		if(pangram==true)
		{
			System.out.println("String is a pangram");
		}
		else
		{
			System.out.print("not a pangram");
		}
	}

}
