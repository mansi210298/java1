package seven_jan_friday;

public class string_into_character_array_1 {
	public static void main(String[] args)
	{
		
		//first method:
		String name="MANSI"; 
		//int n=name.length();  //for length of the string
		
		//char[] array=new char[n];    //array size initialize
		
		
	//for(int i=0;i<array.length;i++)    //array.length is array property
		//{
	//	array[i] =name.charAt(i);  //for filling of array from string character by character
			//System.out.print(array[i]);
		//}
		
		
		
		//second method
	char[] s =name.toCharArray();     // for converting string into char array (other method),   creating array and storing the array returened by toCharArray()
		
		for(int i=0;i<s.length;i++) 
		{
			System.out.print(s[i]);
		}		
		
		}
		
	}


