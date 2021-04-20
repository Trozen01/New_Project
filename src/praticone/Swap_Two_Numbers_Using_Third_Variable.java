package praticone;

import java.util.Scanner;

public class Swap_Two_Numbers_Using_Third_Variable {

	public static void main(String[] args) {
		
		int x, y, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First value for X:-");
        x= sc.nextInt();
        System.out.println("Enter Second value for Y:-");
        y=sc.nextInt();
        temp = x;
        x = y;
        y=temp;
        System.out.println("value of x:"+x);
        System.out.println("value of y:"+y);        

	}

}
