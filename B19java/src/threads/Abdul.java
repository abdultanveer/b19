package threads;

public class Abdul extends Thread {
	ATM atm;
	
	
	
	public Abdul(ATM atm) {
		this.atm = atm;
	}



	@Override
	public void run() {
		atm.withdraw(15000);
	}

}
