package OtherExample;

import java.util.Hashtable;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
		userinput();
		
		
	}
	
	public static void khalid(){
		
		Hashtable<String, Integer> h1 = new Hashtable<String, Integer>(); 
		Hashtable<String, Integer> h2 = new Hashtable<String, Integer>();
		Hashtable<String, Integer> h3 = new Hashtable<String, Integer>();
		
		h1.put("Khalid", 50);
		h1.put("Aamir", 100);
		h1.put("Zobel", 100);

		h2.put("farha", 100);
		h2.put("Amreen", 100);
		h2.put("Anam", 100);
		
		h3.put("Yogi", 100);
		h3.put("Ana", 50);
		h3.put("Sur", 100);
		
		int a = (int) h1.get("Khalid");
		int b = (int) h1.get("Aamir");
		int c = (int) h1.get("Zobel");
		
		int d = (int) h2.get("farha");
		int e = (int) h2.get("Amreen");
		int f = (int) h2.get("Anam");
		
		int g = (int) h3.get("Yogi");
		int h = (int) h3.get("Ana");
		int i = (int) h3.get("Sur");
		
		int H = a+b+c;
		System.out.println(H);
		int I = d+e+f;
		System.out.println(I);
		int J = g+h+i;
		System.out.println(J);
		
		int K = H+I+J;
		System.out.println(K);
		
	}

	public static void userinput(){
		
		Scanner sc= new Scanner(System.in);    // take a input from user.
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		int d=a+b+c;  
		System.out.println("Total= " +d);  
		
	}
	
}
