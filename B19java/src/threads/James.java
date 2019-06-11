package threads;

public class James extends Thread {
	ATM atm;

	public James(ATM atm) {
		this.atm = atm;
	}
	
	@Override
	public void run() {
		atm.deposit(15000);
	}
	
	

}
