package praticone;

import java.util.Scanner;

public class Swap_Two_Numbers_Without_Using_The_Third_Variable {

	public static void main(String[] args) {

		int x, y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First value for x:-");
		x=sc.nextInt();
		System.out.println("Enter Second value for Y:-");
		y=sc.nextInt();
		
		x= x+y;
		y= x-y;
		x= x-y;
		 
		System.out.println("value of x:"+x);
	    System.out.println("value of y:"+y);    
	    
	    System.out.println("value of \nx="+x+"\ny="+y);
	    
	    System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	    

	}

}
