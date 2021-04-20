package JavaTraningSession;

public class TenCallByReferanceCallByValue {
     int p;
     int q;
	
	
	public static void main(String[] args) {
	
	TenCallByReferanceCallByValue obj = new TenCallByReferanceCallByValue();
	int x = 10;
	int y = 20;
	obj.testsum(x, y);  //call by value OR pass by value.

	
	// swap function (call by referance)
	obj.p=50;
	obj.q=60;
	
	System.out.println("value of p is: "+obj.p);
	System.out.println("value of q is: "+obj.q);
	
	obj.swap(obj);
	
	System.out.println("After swap value of p is: "+obj.p);
	System.out.println("After swap value of q is: "+obj.q);
	
	}
	
	
	public int testsum(int a, int b){
		 a= 30;
		 b= 40;
		int c = a+b;
		System.out.println("value of test sum: "+c);
		return c;
	}

	public void swap(TenCallByReferanceCallByValue j ){
		int tmp;
		tmp=j.p;  // temp=50;
		j.p =j.q; // p=60;
		j.q = tmp; //j.q=50;
		
	}
	
}
