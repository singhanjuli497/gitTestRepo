package javaStartString;

public class findVowelWithoutRegex {
	public static void VowelWithoutRegex() {
		String ss1 = "AnjuliSingh";
		char[] ss2 = ss1.toCharArray();
		for (int i = 0; i < ss2.length; i++) {
			if (ss2[i] == 'a' || ss2[i] == 'e' || ss2[i] == 'i' || ss2[i] == 'o' || ss2[i] == 'u') {
				System.out.println(ss2[i]);
			}
		}

	}

	public static void main(String[] args) {
		findVowelWithoutRegex.VowelWithoutRegex();

	}
}