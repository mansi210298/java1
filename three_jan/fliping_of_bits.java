package three_jan;
import java.util.*;

public class fliping_of_bits {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal number:");
		int x=sc.nextInt();
		int arr[]=new int[10];
		int i=0,j=0;
		int m=1;
		while(x>0)
		{
			arr[i++]=x%2; //modulo
			x=x/2;
		} 
		for(j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
	     for(j=i-1;j>=0;j--)
	{
		System.out.print(arr[j] ^ m);
		
	}

}
	
}
