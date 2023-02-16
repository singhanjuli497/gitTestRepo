package javaStartString;

public class findVowel {

	public static void vowel() {
		String name1 = "anjuliSingh";
		char[] ch = name1.toCharArray();
		//System.out.println(ch);
		String regularExpr = ".*[aeiou].*";
		int count = 0;
		for (int i = 0; i < name1.length(); i++) {
			if (String.valueOf(ch[i]).matches(regularExpr)) {count++;}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		vowel();
	}
}
//not able to handle input with uppercase