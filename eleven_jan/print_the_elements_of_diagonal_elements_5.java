package eleven_jan;

public class print_the_elements_of_diagonal_elements_5 
{
	public static void main(String[] args)
	{
      	int[][] array=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	
     	for(int i=0;i<array.length;i++)
	     {
	        for(int j=0;j<array[0].length;j++)
	        {
	        	//if(i==j || (i+j)==array.length-1)
	        	if(i==j)
	        	{
	        		System.out.print(array[i][j]+" ");
	        	}
	    
	        	if(i+j==array.length-1)
	        	{
	        		System.out.print(array[i][j]+" ");
	        	}
	        }
	      // System.out.println();
	     }

   }
}