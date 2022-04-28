package second_day14;

public class No_of_Factors {
	public static void main(String args[]) {
		 
		int num =10;
		int count=0;
		
		for(int j=1; j<=num ;j++)
		{ if (num%j ==0)
		{
			count= count+1;
		}
		
	}System.out.println(count);

}
}
