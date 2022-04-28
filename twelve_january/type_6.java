//largest element in each row:

package twelve_january;

public class type_6 {
	public static void main(String[] args)
	{
		int[][] array= {{1,2,3},{6,4,2},{9,10,5}};
		int max=array[0][0];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				
				if(array[i][j]>max)
				{
					max=array[i][j];
					
				}
				
				
			}
			System.out.print(max +"," );
			
		}
	}

}
