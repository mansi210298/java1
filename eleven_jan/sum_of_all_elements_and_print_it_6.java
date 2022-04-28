package eleven_jan;

public class sum_of_all_elements_and_print_it_6 {
	public static void main(String[] args)
	{
		int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				sum=sum+array[i][j];
				//sum++;
			}
		}
		System.out.print(sum);
	}

}
