package javaStartString;

public class convertStringToInterger {
	public static void newstr() {
		String str="120"; //one object in SCP with str ref
		int str1=120; // str1 value store in Stack? any objects will be created?
		//if (str.equals(str1)) {
		//if (str==str1) { //incompatible Operand type
		if (str1==Integer.parseInt(str)) {//converted str to integer
			System.out.println("values equal");
		}
		else {
			System.out.println("value not equal");
		}
	}
public static void main(String[] args) {
	newstr();
}
}