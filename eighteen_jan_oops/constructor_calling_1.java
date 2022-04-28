package eighteen_jan_oops;
class A
{
	int x;
	int y;
	
	A(){         //6th step
		System.out.println("MANSI VERMA");
	}
	
	A(int x){       //x=10    ----4th step
		this();  //this will shift the control on line number 7  -----5th step
		this.x=x;
	}
	A(int x,int y)       //x and y got the value 10 and 15  -----2nd step
	{  this(x);         //now this line will send the control on line number 11  -----3rd step
		this.y=y;
	}
	
	A(A obj1)
	{
		this.x=obj1.x;
		this.y=obj1.y;
	}
	
	public void displayObject() {
		System.out.println("x");
		System.out.println(x);
		System.out.println("y");
		System.out.println(y);
	}
}

public class constructor_calling_1 {
	public static void main(String[] args)
	{
		A obj1=new A(10,15);   //it will jump to line number 16      ----  1st step
		obj1.displayObject();
	}
	

}
