package javastart;

public class fizzbuzz {
	

	public static void main(String[] args) {
		 int[] number1 = {1,2,3,4,5,6,7,8,9,10,15,12};
		 for (int a: number1) {
			if (a%3==0 && a%5==0)
			{
				
				System.out.println(a+ " " + "fizzbuzz");
			}
			
			 else if(a%3 == 0)
			 { 
				 System.out.println("fizz");
				 } 
			 else if(a%5 == 0) 
			 {
			 System.out.println("buzz"); 
			 }
			 
		}
	}
}
