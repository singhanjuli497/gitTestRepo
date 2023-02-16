package javaStartString;

public class stringMethods {

	public static void stringMeth() {
		String name = "Anjuli";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String s1 = "AnjuliS"; //1 object created in SCP
		String s2 = "AnjuliS"; //s2 will refer to above object's value
		String s11 = new String("SinghA"); // 2 object will be created/one in heap another in SCP
		String s22 = new String("SinghA"); // 1 object will be created/s22 will point to above object's value in SCP
		//String s22 = new String("Singha");
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); // true
		System.out.println(s11==s22); //false
		System.out.println(s11.equals(s22)); //true //false incase of uppercase
		//System.out.println(s11.equalsIgnoreCase(s22));//true
	} 
	public static void main(String[] args) {
		stringMeth();
	}
}
