package TestNGDependencies;

import org.testng.annotations.Test;

public class DemoOneDependencies {
	
	
	
	@Test(dependsOnMethods="testone",priority=1 )
	public void testtwo(){
		
		System.out.println("I am inside test2");
		
	}
	
	@Test(priority = 2)
	public void testone(){
		
		System.out.println("I am inside test1");
	}

}

//Note:- when we set dependencies for one method that method will run after depended method.
// after run depended method run all method when we set dependencies for one method with priority 