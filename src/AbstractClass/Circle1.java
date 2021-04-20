package AbstractClass;

public class Circle1 extends abstract_class_Shape {
	
	@Override
	public void drow() {
		
		System.out.println("This is override method from parent class in Circle1 class");
	}
	
	void drowagain(){
		
		System.out.println("Drowagain child method from Circle1 class own method of child class");
	}
	
}
