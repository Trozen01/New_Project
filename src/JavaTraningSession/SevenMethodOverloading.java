package JavaTraningSession;

public class SevenMethodOverloading {

	public static void main(String[] args) {
		
    SevenMethodOverloading obj = new SevenMethodOverloading();  //call for non static method we need create object of the class. 
    obj.sum();
	obj.sum(10);
	obj.sum(20, 30);
	}
	
	//we can overload main method.
	//you can not create a method insight a method.
	//duplicate method -- i e same method name with same number of argument are not allowed.
	//method overloading--> When More then one method with different parameter with in the same class.
	public void sum(){  // method with zero parameter.
		
		System.out.println("method with zero parameter");
	}
	public void sum(int a){
		
		System.out.println("method with one parameter");
	}

	public void sum(int b, int a){
		
		System.out.println("method with two parameter");
	}
}
