package praticone;


import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add("20");
		alist.add("30");
		alist.add("40");
		
		System.out.println("alist.size()");
		System.out.println("While loop");
		Iterator itr = alist.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		    System.out.println("Advance For loop");
		    for(Object obj : alist){
            System.out.println(obj);
		}
		
		    System.out.println("For loop");
		for(int i = 0; i<alist.size(); i ++){
			
			System.out.println(alist.get(i));
		}
		
	}

}
