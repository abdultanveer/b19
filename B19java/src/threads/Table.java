package threads;

public class Table {
	
	// printtable is a shared resource
	public synchronized void printTable(int a) {
		for (int i=1; i<6; i++ ) {
		System.out.println(a*i);
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
