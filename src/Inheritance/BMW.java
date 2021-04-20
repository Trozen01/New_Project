package Inheritance;

public class BMW extends Car{
	
	
	@Override
	public void start(){  //overriding method.
		
		System.out.println("BMW own start function..");
	}
	
	public void safety(){
		
		System.out.println("BMW have own best safety feature");
	}
	
}
