package javaStartString;

public class NumberWithOutLoop {
	static int i = 0;

	public static void main(String[] args) {
		printNumbers();
	}

	public static void printNumbers() {
		if (i < 100) {
			i++;
			System.out.println(i);
			printNumbers();
		}
	}
}
