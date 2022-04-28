package seventeen_jan;

class Account{
	int acc_no;
	float balance;  //instances/properties
	String IFSC_code;
	
	
	Account()            //creating a parameterless constructor
	{
		System.out.println("constructor called");    //first line to be printed because of new in main class
		
	}
	
	Account(int acc_no,float balance,String IFSC_code)      // constructor with parameters
	{
		this.acc_no=acc_no;
		this.balance=balance;
		this.IFSC_code=IFSC_code;
		
	}
	
	public float get_balance()   //method of class----balance is float type thats why took float
	{
		return this.balance;   //return is for outgoing
	}
	
	
	public void assignValuestoAccount(int acc_no,float balance,String IFSC_code)
	{
		this.acc_no=acc_no;
		this.balance=balance;
		this.IFSC_code=IFSC_code;
	}
	
}

public class class_account_1 {
	public static void main(String[] args)
	{
		
		
		Account HDFC=new Account(2034567,100.5f,"kkbkr");   //new will generate memory and find constructor with 3 parameters
		{                                                     //line no 15 
			System.out.println(HDFC.acc_no);
			System.out.println(HDFC.balance);
			System.out.println(HDFC.IFSC_code);
		}
		Account ICICI=new Account();     //new will generate memory and find default constructor----line no 9
		
		
	{
		HDFC.acc_no=2034567;
		HDFC.balance=100.5f;
		
		ICICI.acc_no=10008765;
		ICICI.balance=500.45f;
		
		System.out.println(HDFC.acc_no);
		System.out.println(HDFC.balance);
		System.out.println(HDFC.get_balance());
		
		System.out.println(ICICI.acc_no);
		System.out.println(ICICI.get_balance());
		
	}
		
           HDFC.assignValuestoAccount(2034567,100.5f,"kkbkr");       //line no 29
		  {
			System.out.println(HDFC.acc_no);
			System.out.println(HDFC.balance);
			System.out.println(HDFC.IFSC_code);
			
		}
		
		
	}

}
