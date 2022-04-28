//Sum of diagonal matrix:

package twelve_january;

public class type_4 {
	public static void main(String[] args)
	{
		int[][] array= {{1,2,3},{4,5,6},{7,8,10}};
		int sum1=0;
		int sum2=0;
		
		if(array.length!=array[0].length)
		{
			System.out.println("Not applicable for Square matrix");
		}
		
		else
		{
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array[0].length;j++)
				{
					if(i==j)
					{    
						 sum1= sum1 + array[i][j];
						
					}
					if(i+j==array.length-1)
					{
						sum2= sum2 + array[i][j];
					}
				
				}
			} 
			System.out.println(sum1);    // this will be out of the loop 
			System.out.println(sum2);
		}
	}

}
