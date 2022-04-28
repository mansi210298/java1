package eleven_jan;

public class count_number_of_prime_number_in_matrix_9 {
	public static void main(String[] args)
	{
		int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int result1=get_prime_count(array);
		System.out.println(result1);
		
		
	}
	
	public static int get_prime_count(int[][] array)
	{
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				if(is_prime(array[i][j]))
		     	{
				 count++;
		     	}
			}
		}
		return(count);
	
		
		
		
	}
	
	public static boolean is_prime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				
			{
				return (false);
			}
			
		}
		return(true);
				
	}
	

}
