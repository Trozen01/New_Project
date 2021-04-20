package JavaTraningSession;

public class NineWrapperClassConcept {

	public static void main(String[] args) {
		String x = "20";
		System.out.println(x+100);
		
		int a = Integer.parseInt(x);   // convert string to int.
		System.out.println(a+100);
		
		//interger, Double, Charter, Boolean.
		
		//String to double.
		String y ="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+100);
		
		//String to boolean.
		String z = "True";
		boolean bo = Boolean.parseBoolean(z);
		System.out.println(bo);
		
		//int to string 
		int j = 200;
		System.out.println(100+j);
		
		String st = String.valueOf(j);
		System.out.println(100+st);
		
		String u ="100A";
		Integer.parseInt(u);// number format exception because 100A is not a proper int.
	}

}
