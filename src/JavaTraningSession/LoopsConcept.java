package JavaTraningSession;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// while loop
		//dis-advantage of while loop is will generate infinite loop if you dont give incremental/decremental part.
        int i = 1;
        
        while(i<=10)
        {
        	System.out.println(i);
        	i++;
        }
        System.out.println("-------------------------------------------------");
        
        for(int j=0; j<=10; j++){
        	
        	System.out.println(j);
        }
        System.out.println("-------------------------------------------------");
        // print 20 to 1
        
        for (int k=20; k>=1;k-- ){
        	
        	System.out.println(k);
        }
	}

}
