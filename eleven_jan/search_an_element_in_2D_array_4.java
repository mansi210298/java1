package eleven_jan;
import java.util.Scanner;

public class search_an_element_in_2D_array_4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[3][3];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print("Enter the element:");
				int elements=sc.nextInt();
				array[i][j]=elements;
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
		
		System.out.print("Enter the element to be searched:");
		int element=sc.nextInt();
		
		boolean element_found=false;
		int pos=-1;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				if(array[i][j]==element)
				{
					element_found=true;
					pos=i;
					pos=j;
					break;
				}
			}
		}
		if(element_found)
		{
			System.out.println("Eement fount at "+(pos+1)+" position");
		}
		else
		{
		 System.out.print("Element not found");
		}
	}

}
