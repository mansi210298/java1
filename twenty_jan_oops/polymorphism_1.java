package twenty_jan_oops;
class Poly
{
	public int getSum (int a,int b)
	{
		return(a+b);
	}
	public int getSum(int a, int b,int c)
	{
		return(a+b+c);
	}
	
	public String getSum(String a,String b)
	{
		return(a+b);
	}
}

public class polymorphism_1 {
	public static void main(String[] args) {
		
		Poly p= new Poly();
		int result1=p.getSum(4, 5);
		int result2=p.getSum(4,5,6);
		String result3=p.getSum("mansi ","verma");
		
		System.out.println(result1);
		System.out.println(result2);	
		System.out.println(result3);
	}

}
