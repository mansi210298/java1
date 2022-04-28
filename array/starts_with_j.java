package array;

public class starts_with_j {
	 public static void main(String[] args) {
		 String[] Students= {"mansi","kartik","mokshi","sanjay","mani"};	
		 int n=Students.length;
		
		 for(int i=0;i<n;i++)
		 { 
			 if(Students[i].startsWith("m"))
			 {
				 System.out.println(Students[i]);
			 }
				 
		 }
		 
	 }

}
