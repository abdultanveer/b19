package roads;

public class Junction {
	
	public synchronized void passVehicles(String name, int n) {
		for(int i=1; i<6; i++) {
		System.out.println("vehicles of "+name+" road are passing-- vehicle no is "+n*i);
			
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
