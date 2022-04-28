package five_jan;
//import java.util.Scanner;

public class basics_array {
	public static void main(String[] args) {
		int array[]= {10,20,40,65,87,21};
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 !=0)
			{   System.out.print(array[i] +",");
				count++;
			}
		} System.out.println();
		System.out.print("count" +"="+ count);
	

}
}

