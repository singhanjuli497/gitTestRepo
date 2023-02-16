package javaStartString;

public class firstLetterCapital {
	public static void firstLetter() {
		String sf = "they love india";
		String[] sf1 = sf.split(" ");
		for (int i = 0; i < sf1.length; i++) {
			// System.out.println(sf1.length);
			// System.out.println(sf1[i]);
			String sf2 = sf1[i];
			String sf3 = "";
			// they
			for (int j = 0; j < sf2.length(); j++) {
				sf3 = sf2.substring(0, 1).toUpperCase() + sf2.substring(1);
			}
			System.out.print(sf3 + " ");
		}
	}

	public static void main(String[] args) {
		firstLetter();
	}
}
