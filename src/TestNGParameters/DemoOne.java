package TestNGParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoOne {

	
	@Test
	@Parameters({"browsername"})
	public void test(String browser){
		
		System.out.println("My browser is:-" +browser);
		
	}
	
	@Test
	@Parameters({"myname"})
	public void testone(String name){
		
		System.out.println("My name is:-" +name);
		
	}
	
	@Test
	@Parameters({"mysname"})
	public void testtwo(@Optional String sname){
		
		System.out.println("My sname is:-" +sname);
		
	}
	
}


// note:- we can use @optional if do't want pass any value to method 
// just comment to 
// we can pass default value in like this (@optional("Jitusawant" String sname))