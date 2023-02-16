package javaStartString;

public class reverseString {

	public static void reverse() {
		String rev = "Anjuli";
		char[] rev1 = rev.toCharArray();
		// System.out.println(rev1.length);
		for (int i = rev1.length - 1; i >= 0; i--) {
			System.out.print(rev1[i]);
		}
		System.out.println("\n" + "2nd Approach");
		String revv = "Program";
		for (int i = revv.length() - 1; i >= 0; i--) {
			System.out.print(revv.charAt(i));
		}
	}

	public static void main(String[] args) {
		reverse();
	}

}
