package eleven_jan;
import java.util.Scanner;


public class twoD_array_fill_it_with_user_and_display_2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[4][5];     //array declare
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{     System.out.println("Enter the elements:");
				int values =sc.nextInt();
				if(values%2==0)            //if ask for values only even 
				{
				array[i][j]=values;       //this is for putting values in array matrix
				
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
