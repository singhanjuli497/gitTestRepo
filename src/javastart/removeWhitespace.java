package javaStartString;

import java.util.Arrays;

public class removeWhitespace {
	public static void remove() {
		String sr = "I love my india";
		// o/p - Ilovemyindia
		char[] sr1 = sr.toCharArray();
		// System.out.println(Arrays.toString(sr2));
		for (int i = 0; i < sr1.length; i++) {
			if (sr1[i] != ' ') { // type difference
				System.out.print(sr1[i]);
			}
		}
	}

	public static void main(String[] args) {
		remove();
	}
}
