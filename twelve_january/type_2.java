//sum of row and column of a matrix.

package twelve_january;

public class type_2 {
	
	public static void main(String[] args)
	{
		int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<array.length;i++)
		{    int sum_row=0;
			for(int j=0;j<array[0].length;j++)
			{
				sum_row= sum_row + array[i][j];
			}
			System.out.println("Sum of " +(i+1)+" row is:" +sum_row);
		}
		System.out.println("------------------------");
		
		for(int i=0;i<array.length;i++)
		{
			 int sum_column=0;
				for(int j=0;j<array[0].length;j++)
				{
					sum_column= sum_column + array[i][j];
				}
				System.out.println("Sum of " +(i+1)+" column is:" +sum_column);
		}
		
	}

}
