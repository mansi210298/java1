package eleven_jan;

public class twoD_array_by_initializing_3 {
 public static void main(String[] args)
 {
	 int[][] array=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	 
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
