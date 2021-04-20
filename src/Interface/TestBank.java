package Interface;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(ReserveBankOfIndia.Min_bal);   //call static variable. 
		
		
		
       HDFCBank hb = new HDFCBank();
       hb.credit();
       hb.debit();
       hb.transfermoney();
       hb.educationalLoan();
       hb.carLoan();
       System.out.println("------------------------");
      
       //dynamic polymorphism.
       //child class object can be referred by parent interface referance veriable.
       ReserveBankOfIndia RBI = new HDFCBank();
       RBI.credit();
       RBI.debit();
       RBI.transfermoney();
      
      
	}

}
