package TestNGDependencies;

import org.testng.annotations.Test;

public class DependenciesFormultipalTestCases {
	
	@Test(dependsOnMethods={"testone","testthree"})
	public void testtwo(){
		
		System.out.println("I am inside test2");
		
	}
	
	@Test
	public void testone(){
		
		System.out.println("I am inside test1");
	}

	@Test
	public void testthree(){
		
		System.out.println("I am inside test3");
	}
}

//note:- we can set multipal dependencies for one testcases.
