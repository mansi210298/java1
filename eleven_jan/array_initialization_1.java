package eleven_jan;

public class array_initialization_1 {
	public static void main(String[] args)
	{
		int[] array1= {12,13,14};           //1
		for(int i=0;i<array1.length;i++)
		{
		System.out.print(array1[i] + ",");
		}
		System.out.println();
		
		int[] array2;          //declaration
		array2=new int[2];     //size allocation
		array2[0]=10;
		array2[1]=20;
		
		for(int i=0;i<array2.length;i++)
		{
			System.out.print(array2[i] + ",");           //2
		}
		System.out.println();
		
		int[] array3=new int[] {30,40};
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i] + ",");           //3
		}
		
		
	}

}
