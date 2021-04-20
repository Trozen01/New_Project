package TestNGDependencies;

import org.testng.annotations.Test;

public class GroupDependencies {

	@Test(dependsOnGroups="sanityone")
	public void testtwo(){
		
		System.out.println("I am inside test2");
		
	}
	
	@Test(groups="sanityone")
	public void testone(){
		
		System.out.println("I am inside test1");
	}

	@Test
	public void testthree(){
		
		System.out.println("I am inside test3");
	}
	
}
