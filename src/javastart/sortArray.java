package javastart;
import java.util.Arrays;
public class sortArray {

	public static void main(String[] args) {
		int [] ar2= {5,3,8,1,9,7,2,4};
		for (int i=0; i<ar2.length; i++) {
			
			for (int j=i+1; j<ar2.length; j++)
			{
				int temp = 0;
				if (ar2[i]> ar2[j])
				{
					temp = ar2[i];
					ar2[i] = ar2[j];
					ar2[j] = temp;
			     }
			 }			
             System.out.println(ar2[i]);				
	}
	}
	}