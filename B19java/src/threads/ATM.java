package threads;

public class ATM {
	
	int amount  = 10000;
	
	public synchronized void withdraw(int amountWithdrawn) {
		System.out.println("going to withdraw money");
		if(amount < amountWithdrawn) {
			System.out.println("less funds");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		amount = amount - amountWithdrawn;
		System.out.println("withdrawal completed");
	}
	
	public synchronized void deposit(int amountDeposited) {
		System.out.println("going to deposit money");

		amount = amount +amountDeposited;
		System.out.println("deposited");
		notify();

	}

}
