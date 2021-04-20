package pratic;

public class FunctionsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsinJava fij = new FunctionsinJava();
		fij.test();
		fij.abc();
		fij.def();
		fij.xyz(10, 20);

	}
	
	public void test(){
		
		System.out.println("void function");
	}
	
	
	public int abc() {   // no input some output.
		int a=10;
		int b=20;
		int c= b-a;
		return c;
		
	}

	public String def() {   // no input some output.
		
		String J ="Selenium"; 
		
		return J ;
	}
	
	public int xyz(int p , int q) {   // some input some output.
		
		int r = p*q;
		
		return r;
	}
	
}
