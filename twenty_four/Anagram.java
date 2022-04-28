package twenty_four;

public class Anagram {
	public static void main(String[]args)
	{
		String name1="mansi";
		String name2="aansim";
		int array[]=new int[100];
		char[] s= name1.toCharArray();       //converting string to char array as string cannot run in loops;
		char[] t=name2.toCharArray();
		for(int i=0;i<name1.length();i++)    //name1.length() is string length
		{
			array[s[i]-'a']++;     //mapping
		}
		for(int i=0;i<name2.length();i++)
		{
			array[t[i]-'a']--;  // mapping
		}
		
		boolean flag=false;
		for(int i=0;i<100;i++)
		{
			if(array[i]!=0)
			{
				System.out.print("not anagram");
				flag=true;
				break;
			}
		} if(flag==false) {
			System.out.println("Anagram");
		}
	}

}
