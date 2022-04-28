// Transpose of a matrix:

package twelve_january;

public class type_5 {
	
	public static void main(String[] args)
	{
		int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]swap= new int[array.length][array[0].length];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				 swap[i][j]=array[j][i];
				
				
				System.out.print(swap[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
