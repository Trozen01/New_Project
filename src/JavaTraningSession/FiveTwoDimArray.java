package JavaTraningSession;

public class FiveTwoDimArray {

	public static void main(String[] args) {
	
		FiveTwoDimArray fd = new FiveTwoDimArray();
		fd.data();
		
	}

	public void data(){
		
		try {
			String a[][] = new String[3][5];
			
			System.out.println(a.length);  // total no. of row.
			System.out.println(a[0].length);  // total column.
			
			//1 row
			a[0][1] = "A";
			a[0][2] = "B";
			a[0][3] = "C";
			a[0][4] = "D";
			a[0][5] = "E";

			//2 row
			a[1][1] = "A1";
			a[1][2] = "B1";
			a[1][3] = "C1";
			a[1][4] = "D1";
			a[1][5] = "E1";
			
			//3 row 
			a[2][1] = "A2";
			a[2][2] = "B2";
			a[2][3] = "C2";
			a[2][4] = "D2";
			a[2][5] = "E2";
			
			System.out.println(a[1][1]);
			System.out.println(a[2][1]);
			
			System.out.println(a[0][1]);
			
			//print all value of second row 
			
			for(int row=0; row<a.length; row++){
				for(int col=0; col<a[0].length; col++){
					System.out.println(a[row][col]);
					
				}
				
			}
			
		} catch (Exception e) {
		
		}
	}
}
