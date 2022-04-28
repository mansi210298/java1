package twenty_jan_oops;
class Mansi
{
	public void sum(float a,float b)
	{
		System.out.println("int");
	}
	
	public void sum(double a, double b)
	{
		System.out.println("long");
	}
}
public class polymorphism_type_promotion_checking_2 {
	public static void main(String[] args)
	{
		Mansi p=new Mansi();
		
		p.sum(2,3.0f);
	}

}
