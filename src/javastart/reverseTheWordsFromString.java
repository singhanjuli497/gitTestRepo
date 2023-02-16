package javaStartString;

public class reverseTheWordsFromString {
	public static void reverseWords() {
		String s = "My Age";
		String[] s1 = s.split(" ");
		String newreverse = "";

		for (int i = 0; i < s1.length; i++) {
			String reversed = "";
			String s2 = s1[i];// Error without it not able to print char j
			for (int j = s2.length() - 1; j >= 0; j--) { // s1.length got incorrect result
				reversed = reversed + s2.charAt(j);
			}
			newreverse = newreverse + reversed + " ";
		}
		System.out.println(newreverse);
	}

	public static void main(String[] args) {
		reverseWords();
	}
}
