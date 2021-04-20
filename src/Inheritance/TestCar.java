package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
      // We can make a object of the BMW class because its publiclly defind.
		BMW b = new BMW();
		b.start();
	    b.enginoff();
	    b.engin();     // this method from super class
	   
	    
	    System.out.println("--------------");
	    
	    Car c = new Car();
	    c.start();
	    c.petroengin();
	    c.engin();      // this method from parent class of car class.
	    		
	    System.out.println("--------referance object ------");
	    
	    Car cl = new BMW(); //child class object can be refer by parent class referance veriable -----dynamic polymporphisem--run time polymporphisem.
	    cl.start();               // if you declare static method in both parent and child then its call parents method otherwise it will call to child method.
	    cl.enginoff();
	    cl.petroengin();
	    cl.deselengin();
	    cl.engin();
	    
	    
	  
	    // create object of the child class and give reference of parent class and it access all function of parent class if function is common from child and parent it will execute child function.
	   // common method and parent class method will called using dynamic polymorphysim.
	}

}

//Output:-  //if same method available in parent as will as in child then jave will give first preference to child method.
//BMW own start function..  // if you have own method so why you are going to parent.
//this concept call method overriding.(When same method is present in parent class as will as in child class with same name and same argument.)

// difference 1. method overloading means two methods name is same but with different argument with in same class.
//            1. if same method available in parent as will as in child then jave will give first preference to child method is called method overriding.

//start is the overriding method. this method is compile time polymorphism because java will decide which method will run(he check first from child if child have that method then he run that
//if child not have then jave will find that method in parent.)