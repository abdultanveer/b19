package threads;

public class AtmSimulate {
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Abdul abdul = new Abdul(atm);
		abdul.start();
		
		James james = new James(atm);
		james.start();
		
		
	}

}
