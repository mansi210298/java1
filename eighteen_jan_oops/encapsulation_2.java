package eighteen_jan_oops;
class Account{
	private int acc_no;
	private int balance;
	private String IFSC_code;
	
	//getters and setters method
	
	public int getACC()
	{
		return this.acc_no;
	}
	public void setACC(int acc_no)
	{
		this.acc_no=acc_no;
	}
	
	public int getBalance()
	{
		return this.balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public String getifsc()
	{
		return this.IFSC_code;
	}
	
	public void setifsc(String IFSC_code)
	{
		this.IFSC_code=IFSC_code;
	}
	
}

public class encapsulation_2 {
	public static void main(String[] args)
	{
		Account HDFC=new Account();
	        //	HDFC.acc_no=5087654;-------- THIS WILL NOT WORK HERE AS IT IS ENCAPSULATED THERFORE 
		HDFC.setACC(5087654);
		HDFC.setifsc("abcdef");
		System.out.println(HDFC.getACC());
		System.out.println(HDFC.getifsc());
		
	}

}
