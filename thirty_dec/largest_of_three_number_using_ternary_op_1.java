package thirty_dec;

public class largest_of_three_number_using_ternary_op_1 {
	public static void main(String[] args) {
		int a=10,b=15, c=55;
		int result=(a>b) ? ((a>c)?a:b) : ((b>c)?b:c );
		System.out.print(result);
		
	}

}
