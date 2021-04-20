package Polymorphism;

public class Method_Overloading {
	
	public static void display(int a){
        System.out.println("Value from method One: " + a);
    }

	public static void display(int a, int b){
        System.out.println("Value from method Two: " + a + " and " + b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1);
        display(1, 4);
	}

}


//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.(static polymorphism)
//you can find method overridding example in Inheritance package. 