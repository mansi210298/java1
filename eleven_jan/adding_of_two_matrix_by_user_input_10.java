//Adding two matrix

package eleven_jan;
import java.util.Scanner;

public class adding_of_two_matrix_by_user_input_10 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows of matrix1:");
		int a=sc.nextInt();
		System.out.println("Enter the number of coloumn of matrix1:");
		int b=sc.nextInt();
		System.out.println("Enter the number of rows of matrix2:");
		int c=sc.nextInt();
		System.out.println("Enter the number of coloumn of matrix2:");
		int d=sc.nextInt();
		
		if(a==c && b==d)
		{   
			int matrix1[][]= new int[a][b];
			
			System.out.println("Enter the elements of 1st matrix:");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					matrix1[i][j]=sc.nextInt();
				}
			}
			
			System.out.println();
			
			int matrix2[][]= new int[c][d];
			
			System.out.println("Enter the elements of 2nd matrix:");
			for(int i=0;i<c;i++) 
			{
				for(int j=0;j<d;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			
			System.out.println();
			
			int add[][]=new int[a][b];
			
			System.out.println("Addition of two matrixes are:");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					add[i][j]=matrix1[i][j]+matrix2[i][j];
					System.out.print(add[i][j] +" ");
				}
				System.out.println();
			}	
		}
		
		else
		{
			System.out.println("Not applicable to add!!");
		}
		
	}

}
