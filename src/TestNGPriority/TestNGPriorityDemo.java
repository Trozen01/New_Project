package TestNGPriority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

    @Test
	public void TestOne() {

		System.out.println("Testcase 1");
	}
    
    @Test
	public void TestTwo() {

		System.out.println("Testcase 2");
	}
    
    @Test
	public void TestThree() {

		System.out.println("Testcase 3");
	}
    
  //Output.
  //Testcase 1
  //Testcase 3
  //Testcase 2
  //PASSED: TestOne
  //PASSED: TestThree
  //PASSED: TestTwo
  //-----------------------------
    
    @Test(priority = 1)
	public void Testcaseone() {

		System.out.println("Testcase One");
	}
    
    @Test(priority = 2)
	public void TestCaseTwo() {

		System.out.println("Testcase Two");
	}
    
    @Test(priority = 3)
	public void TestCaseThree() {

		System.out.println("Testcase Three");
	}
    
    //Output.
    //Testcase One
    //Testcase Two
    //Testcase Three
    //PASSED: Testcaseone
    //PASSED: TestCaseTwo
    //PASSED: TestCaseThree
    //----------------  
    
    
    @Test(priority = 1)
	public void Testonee() {

		System.out.println("Testcase positive value one");
	}
    
    @Test(priority = -1)
	public void TestTwoo() {

		System.out.println("Testcase negative value one");
	}
    
    @Test(priority = 3)
	public void TestThreee() {

		System.out.println("Testcase positive value three");
	}

    //Output.
    //Testcase negative value one
    //Testcase positive value one
    //Testcase positive value three
    //PASSED: TestTwoo
    //PASSED: Testonee
    //PASSED: TestThreee
      
    //Run at per lowest number first.
    // if i have same priority then it will run alphabetically.
  //----------------
    
    @Test
   	public void functionone() {

   		System.out.println("Test Function One");
   	}
       
       @Test(priority = 1)
   	public void functiontwo() {

   		System.out.println("Test Function Two");
   	}
       
       @Test(priority = 3)
   	public void functionthreee() {

   		System.out.println("Test Function Three");
   	}
    
       //Output.
       //Test Function One
       //Test Function Two
       //Test Function Three
       //PASSED: functionone
       //PASSED: functiontwo
       //PASSED: functionthreee
       //----------------
}



