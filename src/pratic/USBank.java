package pratic;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	   // only method can declare.
	   //on metho body - only method prototype.
	   //in interface only variable can declare
       // value of variable can not be change.
     // No static method in interface. (interface is part of object oriented programming and object can not have static method)
	 // No main method in interface.
	//we can not create object of the interface.(interface are abstract in nature).
	
}
