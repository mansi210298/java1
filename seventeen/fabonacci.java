package seventeen;

public class fabonacci {
	public static void main(String[]args) {
		int n=8,a=0,b=1,i=1,sum=0;
		System.out.print(a+","+b);
		while(i<=n-2) {
		 sum=a+b;
		 System.out.print(","+sum);
		 a=b;
		 b=sum;
	  i++;
		 
		}
		// can do by both
		for(i=1;i<=n-2;i++) {
			sum=a+b;
			a=b;
			b=sum;
		 System.out.print(","+sum);
		}
	}

}
