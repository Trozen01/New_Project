package praticone;

import java.util.Scanner;

public class Find_Prime_Number {

	public static void main(String[] args) {

		int x;
		boolean isprime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for check prime number");
		x = sc.nextInt();
		
		sc.close();

		for (int i = 2; i <= x / 2; i++) {
			int a = x % i;
			System.out.println(a);
			if (x % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}

	}

}
