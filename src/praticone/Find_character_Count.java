package praticone;

public class Find_character_Count {

	public static void main(String[] args) {
String Jitu ="ABCABCaabc";
		
		int l =Jitu.length();
		int count =0;
		int countt =0;
		int counttt =0;
		int countA =0;
		int countB =0;
		int countc =0;
		
		System.out.println("First char is:-"+l);
		
		for(int i = 0;i<=l-1;i++){
			
			char sa= Jitu.charAt(i);
			
			if(sa=='A' || sa=='a'){
				count = count +1;
				//System.out.println("First char is:-"+sa);
            }
			else if (sa=='B' || sa=='b') {
				
				countt = countt +1;
			}
			
			else
			{
				counttt = counttt +1;
			}
		}
		System.out.println("Count of char A="+count);
		System.out.println("Count of char B="+countt);
		System.out.println("Count of char C="+counttt);

	}

}
