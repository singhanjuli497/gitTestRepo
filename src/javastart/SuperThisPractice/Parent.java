package SuperThisPractice;

public class Parent {
    int a;
    int b;
	Parent(int a,int b){
		this.a=a; 
		this.b=b;
		System.out.println("parent constructor");
	}
	void print() {
		System.out.println("print1");
		System.out.println(a+"-->"+b);
	}
	
	void print1() {
		this.print();
		//this.print1();
		System.out.println(a+"--->"+b);
		//System.out.println("print2");
		
	}
	
	public static void main(String[] args) {
	Parent p = new Parent(10,20);
	p.print();
	}
}

//If we are printing values of this.a and this.b then only a and b values will be printed.
//constructor is always called at the time of object creation
//if we are not assigning values to instance variable and passing values in main method then "Zero"value will come
//if we are assigning value with "this.variable" then the value will be printed
//this.a = 10;//this can't be called in main method
//passing value of a into instance 'a' that's why it's in blue which means instance variable

		/*[(int c,int d)
		int a = c;
		int b = d;]*/ //This is also fine
		//a=a; // in this case 
		//b=b;