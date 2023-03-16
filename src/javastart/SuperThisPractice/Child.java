package SuperThisPractice;

public class Child extends Parent1 {

	Child(){
	super(10);                                                       
	System.out.println("child constructor");
	}
	void print() {
		super.print();//called parent class method
		System.out.println(super.a);
		
		System.out.println("child meth");
	}
	public static void main(String[] args) {
		Child ch = new Child();
	    ch.print();
	}
	
}
//What should be output:first parent constructor>child constructor
// Even though we write Super() or not in Child constructor by default Parent class constructor will be called
// If methods are also in child class along with constructors then first parent constructor>child constructor > method
//And if super is there in child method then parent class method will also be called.
