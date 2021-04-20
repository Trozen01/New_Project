package JavaTraningSession;

public class EightStaticAndNonStaticConcept {

	String name = "Jitu"; // non static veriable
	static int age = 120; // static veriable.

	public static void main(String[] args) {
		
		// how to call static method and vars.
		//1.direct calling.
		sum();
		System.out.println(age);
		
		//2.Calling by class name.
		EightStaticAndNonStaticConcept.sum();
        System.out.println(EightStaticAndNonStaticConcept.age);
       
       // how to call non static method.
        EightStaticAndNonStaticConcept obj = new EightStaticAndNonStaticConcept();
        obj.sendmail();
       System.out.println(obj.name);
       
       // can i access static method by using object referance of the class.? yes but it will give you warning.
      // obj.sum();
		
	}

	public void sendmail() {

		
		System.out.println("send mail method");
	}

	public static void sum() {
		System.out.println("sum method");
	}

}
