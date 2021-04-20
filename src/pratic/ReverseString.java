package pratic;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Jitendra";

		// Get bytes() convert string into byte and then make loop on that.
		byte[] bytestringarray = input.getBytes();

		byte[] result = new byte [bytestringarray.length];

		// store result in reverse order into the result byte.

		for (int i = 0; i < bytestringarray.length; i++) {

			result[i] = bytestringarray[bytestringarray.length-i-1];
		}
			System.out.println(new String(result));
		

		System.out.println("==========================================================================================");
		
		// using reverse() method of the StringBuilder class.
		// String class does not have reverse() so we can convert the string to string builder.

		String inputone = "jitendra";

		StringBuilder build = new StringBuilder();
		build.append(inputone);

		build = build.reverse();
		System.out.println(build);

		// String a=build.toString(); we can convert string builder to string and then print.
		// System.out.println(a);

		System.out.println("==========================================================================================");

		String inputvalue = "TestString";

		// Convert string to array by using tocharArray.

		char[] array = inputvalue.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.print(array[i]);
		}

	}

}
