package AbstractClass;

public abstract class abstract_class_Shape {

	int id ;                       //--we can declare any veriable in abstract class don't need to initialise                          -- we can declare any veriable in interface but we need to initialise because its final in nature.
	public void drow() {           //abstract method does not have body.
		
	}
	
	public void dro() {
		System.out.println("Method from super parent");   // method implementation.
	}
}



//--abstraction means showing relevent information.
//--abstract class is incomplete class.
//--to use abstract class, other class can be derived from it.
//--abstract class can contain abstract and non abstrract method.
//--abstract class methods private by defacult but method can be public and abstract in nature.



//difference between abstract class and interface.
//--abstract class can support implementation of method (member)                                      -- interface can not support implementation any method.
//--abstract class can have partial implementation                                                    -- interface can not support partial implementation.
//--we need to use extend key word for use abstract class                                             -- we need to use implements key word for use interface.
//--in abstract class variable can have public, private,final,non final,static and non staic.         --  In interface all veriables by default public static and final in nature.
//--we can declare any veriable in abstract class don't need to initialise                            -- we can declare any veriable in interface but we need to initialise.
//-- using abstract class we can not achive multipal inheritance.                                     -- using interface we can achive mulipal inheritance.
//--abstract class can have constructor                                                               --interface can't have constructor.