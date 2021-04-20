package JavaTraningSession;

import java.util.Hashtable;

public class ElevenHashTable {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		
		ht.put("A", "Jitu");   // string combination key and value.
		ht.put("B", "JP");
		ht.put("C", "Sawant");
		
		System.out.println(ht.size());
		
		ht.put(1, 100);        // integer combination key and value
		ht.put(2, 200);
		ht.put(3, 500);
		
		System.out.println(ht.size());
		System.out.println(ht.get("C"));
		System.out.println(ht.get(3));
		int i = (int) ht.get(3);
		
		
		
		ht.put(3, "Jiten");    // any combination key and value
		
		// if you want only interger value allowed for key and value.(same for other datatype)
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		h.put(1, 200);
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();   // we can make any combination like this.
		h1.put(2, "abcd");
	}

}
