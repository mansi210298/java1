package ten_jan_monday;

public class reverse_a_word_1 {
	public static void main(String[] args)
	{
		String name="JAVA";
		int l=name.length();
		
		char[] array=new char[l];
		//array=name.toCharArray();
		
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=name.charAt(i);    //again write to revise
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
		for(int j=array.length-1;j>=0;j--)
		{
			System.out.print(array[j]);
		}
		
	}

}
