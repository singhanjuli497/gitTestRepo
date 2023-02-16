package javaStartString;

import java.util.Arrays;

public class findAnagramString {
	public static void anagram() {

		String f1 = "wait";
		String f2 = "aitw";
		char[] f11 = f1.toCharArray();
		char[] f22 = f2.toCharArray();
		// System.out.println(Arrays.sort(f11)); //Error: The method println(boolean) in
		// the type PrintStream is not applicable for the arguments (void)
		Arrays.sort(f11);
		// System.out.println(Arrays.toString(f11));
		Arrays.sort(f22);
		// System.out.println(Arrays.toString(f22));
		if (Arrays.equals(f11, f22)) {
			System.out.println("String is anagram");
			// if (Arrays.toString(f11)==Arrays.toString(f22)) {
			// System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}
	}

	public static void main(String[] args) {
		anagram();
	}
}
//is there any way to check return type of methods? like when i want to check wat does Arrays.sort(f11) returns?
