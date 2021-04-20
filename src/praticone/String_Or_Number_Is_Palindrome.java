package praticone;

import java.util.Scanner;

public class String_Or_Number_Is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		int length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String or Number:-");
		original = sc.nextLine();
		length = original.length();
		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse String is:-" + reverse);

		if (original.equals(reverse)) {
			System.out.println("The number is a palindrome");
		}
		else{
		System.out.println("The number is not a palindrome");
		}
	}

}
