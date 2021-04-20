package JavaTraningSession;

public class FiveClass {

	//Class ver
	
	int mod;
	int wheel; 
	
	public static void main(String[] args) {
		
		//new FiveClass(); this is the object of the class.
		// c and b is the only object referance variable.
		
	  FiveClass b = new FiveClass();
	  FiveClass c = new FiveClass();
	  
	  b.mod=2018;
	  b.wheel=4;
	  
	  c.mod=2019;
	  c.wheel=4;
	  
	   System.out.println(b.mod);
	   System.out.println(b.wheel);
	   
	   System.out.println(b.mod);
	   System.out.println(b.wheel);
	  
	}

}
