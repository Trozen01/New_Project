package pratic;

public class StaticAndNonStaticConcept {
	
	//Global veriable.
	String name = "Tom";   // non static global veriable.
	static int age = 28;   // static globle veriable.

	public static void main(String[] args) {
		// how to call static method.
         //1.Direct calling.
		   sum();
		//2.call by classname.
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		//How to call non static method.
		StaticAndNonStaticConcept ssc = new StaticAndNonStaticConcept();
		ssc.sendmail();
		System.out.println(ssc.name);
		
		//can i acess static method by using object referance ? yes 
		ssc.sum();   // but this is not a good pratic because it's provide worning.

	}

	public void sendmail(){
		
		System.out.println("Send mail method");
	}
	
	public static void sum(){
		
		System.out.println("Sum of all");
		
	}
	
}
