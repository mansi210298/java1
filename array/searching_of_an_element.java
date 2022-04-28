package array;

public class searching_of_an_element {
	public static void main(String[]args)
	{
		int[] arr= {20,40,54,60,22,10,54};
		int n= arr.length;
		int i=0,d=54,pos=-1;
		boolean element_is_found=false;
		
		for(i=0;i<n;i++)
		{
			if(arr[i]==d) {
				element_is_found=true;
				pos=i;
			//	break;      //helps in breaking the loop
			}
		}if(element_is_found)
		{
			System.out.print("element found"+" at "+(pos+1)+" position");
		}else {
			System.out.print("element not found");
		}		
		
			
	}

}
