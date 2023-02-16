package javaStartString;

public class findPalindrome {
	public static void palin() {
		String nam = "naman";
		String nam1 = "";
		for (int i = nam.length() - 1; i >= 0; i--) {
			nam1 = nam1 + nam.charAt(i);
			//System.out.println(nam1);
		}
		if (nam.equals(nam1)) {
			System.out.print("This is Palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
	}
	public static void main(String[] args) {
		palin();
	}
}
