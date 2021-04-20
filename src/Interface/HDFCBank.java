package Interface;

public class HDFCBank implements ReserveBankOfIndia, USABank {
	
	
  // if class implementing any interface, then its mandatory to define all the menthods of interface.
	
	public void credit() {

		System.out.println("Credit limit declare");
	}

	public void debit() {

		System.out.println("debit limit not declare yet");
	}

	public void transfermoney() {

		System.out.println("transfermoney limit not declare yet");
	}

	public void educationalLoan() {

		System.out.println("educationalLoan limit not declare yet");
	}

	public void carLoan() {

		System.out.println("carLoan limit not declare yet");
	}

	// USA Bank Interface.
	public void foregionexchange() {

		System.out.println("Foreign exchange functioality from USA bank interface");
	}

	

}
