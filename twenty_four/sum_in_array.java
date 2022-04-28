package twenty_four;

public class sum_in_array {
	public static void main(String[]args) {
		int []array= {3,4,6,5,10,1,0,5};
		int n=array.length;
		int d=8;int i,j=0;
		
		for(i=0;i<n;i++)
		{
			for( j=i;j<n;j++)
			{
				if(array[i]+array[j]==d)
				{
					System.out.println(array[i]+" at position "+ i +" and "+array[j]+" at position "+ j);
				}
			}
		}
	}

}
