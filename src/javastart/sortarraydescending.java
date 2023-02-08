package javastart;
import java.util.Arrays;
public class sortarraydescending {

	public static void main(String[] args) {
		int [] ar3= {5,3,8,1,9,7,2,4};
		for (int i=0; i<ar3.length; i++) {
			
			for (int j=i+1; j<ar3.length; j++)
			{
				int temp = 0;
				if (ar3[i]< ar3[j])
				{
					temp = ar3[i];
					ar3[i] = ar3[j];
					ar3[j] = temp;
			     }
			 }			
             System.out.println(ar3[i]);				
	}
	}
	}
