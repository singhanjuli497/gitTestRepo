package javaStartString;

public class swapString {
public static void main(String[] args) {
	String first = "Anjuli";
	String last = "Pooja";
	//f=Car+Pool=Carpool
	//l=f-l=(Car+Pool)-Pool=Car
	//f=f-l=car+pool-car=pool
	first=first + last;
	//System.out.println(first);
	last=first.substring(0, first.length()-last.length());
	//System.out.println(last);
	first=first.substring(last.length());
	System.out.println("swapped first string: " + first + "\n"+"swapped last string: " + last);
}
}
//How to swap two strings without using the third variable?