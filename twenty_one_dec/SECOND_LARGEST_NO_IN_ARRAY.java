package twenty_one_dec;

public class SECOND_LARGEST_NO_IN_ARRAY {
	public static void main(String[]args)
	{
		int list[]= {20,50,42,10,60,56};
		int i=0,max=list[0],sec_max=list[0];
		int n=list.length;
		
		for(i=0;i<n;i++)
		{
			if(list[i]>max)
			{
				max=list[i];
			}
		}
	  for(i=0;i<n;i++)
		{
			if(list[i]>sec_max && list[i]!=max)
			{
				sec_max=list[i];
			}
		}
	    System.out.println(sec_max);
		
	}

}
