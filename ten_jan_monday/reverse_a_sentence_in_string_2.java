package ten_jan_monday;


public class reverse_a_sentence_in_string_2 {
	public static void main(String[] args)
	{
		String name="My Name is Mansi";
		int i;
		
	 String[] array=name.split(" ");   //My---Name---is----Mansi--- (splited by this) and (" ") means from where to split.
		 
		StringBuilder sb=new StringBuilder();     //for joining the splited words
		
		for( i=array.length-1;i>=0;i--)
		{
			sb.append(array[i] +" ");          //sb is object
		}
		System.out.println(sb.toString());   //object to string function
		
	}

}
