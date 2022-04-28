package seventeen;

public class factorial_1 {
	public static void main(String[]args)
	{
		int n=6,i=1,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}System.out.println("factorial of"+" 6 is "+fact);
	}

}
