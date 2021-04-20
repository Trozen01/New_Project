package pratic;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can override main method also.
		//you can not create method insight of other method.
		//duplicate method ...same method nahe with same numbers of  argument is not allowed
		
		MethodOverLoading md = new MethodOverLoading();
		
		md.sum();
		md.sum(31);
		md.sum(10, 20);
	}
	
	// this concept is called method overloading.
	//method overloading --> when method name is same with different argument or input parameters with in the same class. 
	public void sum(){   //0 input parameter.
		System.out.println("sum methos with zero parameter");
		
	}
	
	public void sum(int a){ //1 input parameter.
		
		System.out.println("1 input parameter");
		System.out.println(a);
		
	}
	
	public void sum(int b, int c){  //2 input parameter.
		
		System.out.println("2 input parameter");
		
		int d = b+c;
		System.out.println(d);
	}

}

 
