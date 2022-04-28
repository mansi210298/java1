package twenty_one_dec;

public class max_and_min_in_an_array {
	public static void main(String[] args) {
	//	int []list;
		//int []list=new int[6];
		int list[]= {23,26,28,29,30,1};
		int n= list.length;
		int i=0; int min=list[0],max=list[0],pos=-1,o_pos=-1;
	  // int min=Integer.MIN_VALUE;
	//  	int max=Integer.MIN_VALUE;
		for(i=0;i<n;i++)
		{
			if(list[i]<min)  //for min formulaa
           {
	         min=list[i]; 
	         pos=i;
            }
			if(list[i]>max)   //for max formulaa
			{
				max=list[i];
				o_pos=i;
			}
                
		}System.out.println(min+" at position "+(pos+1));
	     System.out.print(max+" at position "+(o_pos+1));
	}

	
	
	
	
	
	
	
	
	
	
}
