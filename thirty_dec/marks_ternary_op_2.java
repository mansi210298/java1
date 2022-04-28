package thirty_dec;
import java.util.Scanner;

public class marks_ternary_op_2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter marks:");
	int marks= sc.nextInt();
	String result=(marks>80) ? "great" : ((marks>50 && marks<80) ? "good" :"need improvement");
	System.out.print(result);
			
			
	}
}
