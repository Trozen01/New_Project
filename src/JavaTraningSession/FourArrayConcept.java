package JavaTraningSession;

public class FourArrayConcept {

	public static void main(String[] args) {
		// int array.
		// lowest bound/index =0;
		//upper bound/index = n-1;
		// one dimenational array.
		//dis advantages of array:
		//1.size is fix -- static array      - to solve this issue we use collections like ArrayList, Hashtable, dynamic array. 
		//2. store only similar data types.  - to solve this issue we use Object array.  
		
		int i[] = new int[3];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;

		System.out.println(i[2]);
		System.out.println(i.length);  // size of the array.
		//print all value of the i array.
		
		for(int j=0; j<=i.length; j++){
			
			System.out.println(i[j]);
			
		}
		//2.double array.
		double d[] = new double[3];
		d[0] = 1.2;
		d[1] = 1.3;
		d[2] = 1.4;
		
		//3.char array.
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		//4.boolean array.
		boolean b[] = new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		String s[] = new String [3];
		s[0] = "jitu";
		s[1] = "JP";
		s[2] = "sawant";
		
		
		//6.Object array. is used for store different data types value.
		Object obj[] = new Object[5];
		obj [0] = "jitu";
		obj [1] = 25;
		obj [2] = 12.33;
		obj [3] = "1/11/1991";
		obj [4] = 'M';
		
		System.out.println(obj.length);
	}

}
