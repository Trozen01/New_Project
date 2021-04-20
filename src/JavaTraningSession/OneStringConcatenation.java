package JavaTraningSession;

public class OneStringConcatenation {

	public static void main(String[] args) {
		
		//+ : is use for Concatenation
		// println : is use to print on the console with a new line.
		// print is use for just print.
		int a = 100;
		int b = 200;
		
		String x = "Jitu";
		String y = "Sawant";
		
		Double c = 12.33;
		Double d = 22.56;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+y+b+x);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
        System.out.println("The value is "+x);
		System.out.println("The sum is "+(a+b));
		System.out.println("The value of concatenation is "+(x+y));
		
		System.out.println("==================================================");
		// comparision operators.
		// < > >=  <=  == !=
		
		int e = 20;
		int f = 20;
		
		if(e==f)
		{
			System.out.println("The both re equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		//write a logic to find out the highest logic using nested if-else.
		int g =10;
		int h =20;
		int i =30;
		
		if (g>h & g>i){
			
			System.out.println("g is greater");
		}
		else if (h>i) {
			System.out.println("h is greater");
		}
		else {
			System.out.println("i is greater");
		}
		
	}

}
