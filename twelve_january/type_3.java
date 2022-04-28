//Check a given matrix is identity matrix or not:

package twelve_january;

public class type_3 {
	public static void main(String[] args)
	{
		int[][] array= {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag=false;
		if(array.length!=array[0].length)
		{
			System.out.println("Matrix is not Square matrix");
		}
		
		else {
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				if(i==j && array[i][j]!=1)
				{
					flag=true;
					break;
				}
				if(i!=j && array[i][j]!=0)
				{
					flag=true;
					break;
				}
			}
		  }
	   }
		
		if(flag==true)
		{
			System.out.println("Not an Identity matrix");
		}
		else {
			System.out.println("Identity matrix");
		}
	}
	
}
