package seven_jan_friday;

public class number_of_alphabet_character_in_a_string_6 {
	public static void main(String[] args)
	{
		String address="noida";
		int l=address.length();
		
		char[] array=new char[l];
		array=address.toCharArray();
		
		//int Address=Integer.parseInt(address);
		
		int i=0,count=0;
		while(i<array.length)
		{
			if(array[i]>=65 && array[i]<=90 || array[i]>=97 && array[i]<=122)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);
		
		
		
	}

}
