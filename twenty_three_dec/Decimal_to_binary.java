package twenty_three_dec;

public class Decimal_to_binary {
	public static void main(String[]args) {
		int num=11;int i=0;int index=0;
		int []array=new int[10];
		
		
		while(num>0)
		{
			array[index]=num%2;   //will give remainder    array[0]=1
			 num=num/2;           //will give quotient which will become number again   num=8
			 index++;            // index=1
		}
		
		for(i=index-1;i>=0;i--)
		{
			System.out.print(array[i] +" ");
		}
	}

}
