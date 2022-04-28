package thirty_dec;
import java.util.Scanner;

public class even_odd_by_ternary_op_3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int x=sc.nextInt();
		
		String result=(x%2==0) ? "Even" : "odd";
		System.out.println(result);
		
		
	}

}
