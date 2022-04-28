package three_jan;

public class no_of_set_bits_2 {
	public static void main(String[] args) {
		int num=21;
		int count =0;
		while(num>0) {
			int result=num & 1;
			if(result==1)
			{
				//count++;
				//++count;
				count+=1;
			}
			//num=num>>1;
			num>>=1;
		}
		System.out.print(count);
	}

}
