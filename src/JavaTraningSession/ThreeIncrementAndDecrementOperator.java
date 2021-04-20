package JavaTraningSession;

public class ThreeIncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		//pre increment.
		System.out.println("------------pre increment.-----------");
		int i = 1;
		int j =i++;  // first pass the value and then increment.
		
		System.out.println("Value of i is: "+i);
		System.out.println("Value of j is: "+j);
		
		System.out.println("------------post increment.-----------");
		
		int h = 1;
		int k = ++h;
		
		System.out.println("Value of h is: "+h);
		System.out.println("Value of k is: "+k);
		
		System.out.println("------------post decrement.-----------");
		
		int m = 10;
		int n = m--;
		
		System.out.println("Value of m is: "+m);
		System.out.println("Value of n is: "+n);
		
		System.out.println("------------pre decrement.-----------");
	
		int p = 10;
		int q = --p;
		
		System.out.println("Value of p is: "+p);
		System.out.println("Value of q is: "+q);
		
	}

}
