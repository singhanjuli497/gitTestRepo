
package javaStartString;

public class findVowelUppercase {

	public static void vowel() {
		String name1 = "AnjuliSingh";
		// System.out.println(name1.toLowerCase());
		String regularExpr = ".*[aeiou].*";
		int count = 0;
		for (int i = 0; i < name1.length(); i++) {
			if (String.valueOf(name1.toLowerCase().charAt(i)).matches(regularExpr)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		vowel();
	}
}
