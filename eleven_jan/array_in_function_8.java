package eleven_jan;

public class array_in_function_8 {
	public static void main(String[] args)
	{
		int array[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		int result=getSum(array);
		System.out.print(result);
	}
	
	public static int getSum(int array[][])    //parameter declaration only and will be initialized in main function
	{   int sum=0;
	
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array[0].length;j++)
		{
			sum=sum+array[i][j];	
		}
	}
		return sum;
	}

}
