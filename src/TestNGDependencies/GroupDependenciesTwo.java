package TestNGDependencies;

import org.testng.annotations.Test;

public class GroupDependenciesTwo {
	
	@Test(dependsOnGroups="sanity.*")    // those depoendencies which start from sanity group name
	public void testtwo(){
		
		System.out.println("I am inside test2");
		
	}
	
	@Test(groups="sanityone")
	public void testone(){
		
		System.out.println("I am inside test1");
	}

	@Test(groups="sanitytwo")
	public void testthree(){
		
		System.out.println("I am inside test3");
	}

}

//Note:- run test case after run all group. 
// we canm run this using testngXML.