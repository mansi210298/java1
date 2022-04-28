package array;

public class names_start_with_j_and_age {
	public static void main(String[] args)
	{
		String[] name = {"john","rahul","julie","ram" };
		int[] age= {22,50,19,57};
		int i=0;
		while(i<age.length)
		{
			if(name[i].startsWith("j")&&age[i]>20)
			{
				System.out.println(name[i]);
				
			}i++;
		} 
	}

}
