package second_day14;

public class Prime_no {
	public static void main(String args[]) {
		int num=5; int count =0;
		
		for(int i=1;i<=num; i++)
		{
			if(num%i ==0)
				count++;
		}
		if(count ==2)
		{System.out.println("Prime NO");
		
		} else { System.out.println("Not a Prime NO"); }
	}

}
