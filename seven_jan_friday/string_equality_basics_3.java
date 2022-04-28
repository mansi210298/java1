package seven_jan_friday;

public class string_equality_basics_3 {
	public static void main(String[] args)
	{
		String name1="MANSI";   //literal form
		String name2="MANSI";
		
		String name3="mansi";
		String name4=new String("mansi");   //object form
		
		
		System.out.println((name1.equals(name2)));
		System.out.println((name3.equals(name4)));
		System.out.print((name1.equalsIgnoreCase(name4)));
		
		
		
	}

}
