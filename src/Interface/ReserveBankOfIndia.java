package Interface;

public interface ReserveBankOfIndia {
	
	int Min_bal = 1000;   // variable is static in nature.

	
	public void credit();
	public void debit();
	public void transfermoney();
	
	
	
	
	//property of the interface.
    //1.interface is look like a class but it is not a class.
	//2.it allow Only method declearation.
	//3.In interface we can declare the variables, and variables are by default static and final in nature Variable value will not be change.
	//4.we can not create object of the interface.
	//5.Interface is abstract in nature.
    //6.using interface we can achive mulipal inheritance.
	
	
	
	//difference between abstract class and interface.
	//--abstract class can support implementation of method (member)                                       -- interface can not support implementation any method.
	//--abstract class can have partial implementation                                                     -- interface can not support partial implementation.
	//--we need to use extend key word for use abstract class                                              -- we need to use implements key word for use interface.
	//--in abstract class variable can have public, private,final,non final,static and non staic.          --  In interface all veriables by default public static and final in nature.
	//--we can declare any veriable in abstract class don't need to initialise                             -- we can declare any veriable in interface but we need to initialise.
	//-- using abstract class we can not achive multipal inheritance.                                      -- using interface we can achive mulipal inheritance.
	//--abstract class can have constructor                                                                --interface can't have constructor.


}
