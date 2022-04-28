package twenty_jan_oops;
class A
{    
	protected void show()
	{
		System.out.println("parent");
	}
}	 
class B extends A
{    @Override
	protected void show()
	{
		System.out.println("child");
	}
}


public class overriding_check_3 {
public static void main(String[] args)
{
	B obj= new B();
	obj.show();
}
}
