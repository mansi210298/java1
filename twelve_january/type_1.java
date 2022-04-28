//two matrixes are identical or not:

package twelve_january;
import java.util.Scanner;

public class type_1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the rows of matrix1");
		int r1=sc.nextInt();
		System.out.println("enter the column of matrix1");
		int c1=sc.nextInt();
		System.out.println("enter the rows of matrix2");
		int r2=sc.nextInt();
		System.out.println("enter the coloumn of matrix2");
		int c2=sc.nextInt();
		
		
		int matrix1[][]=new int[r1][c1];
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.println("enter the elements");
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		int matrix2[][]=new int[r2][c2];
		
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.println("enter the elements");
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		boolean equal=false;
		if(r1==r2 && c1==c2)
		{    for(int i=0;i<r1;i++)
		   {
			 for(int j=0;j<c1;j++)
			 {
	
			if(matrix1[i][j]!=matrix2[i][j])
			{
				equal=true;
				break;
			}
			 }
		  }
		}
		else
		{
			System.out.println("not identical");
			System.exit(0);     //will not go to further lines (important)
			
		}
		
		if(equal==true)
		{
			System.out.println("not equal");
		}
		else
		{
			System.out.println("equal");
		}
			

}
}

