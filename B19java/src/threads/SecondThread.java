package threads;

public class SecondThread extends Thread {
	Table table;

	public SecondThread(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(100);
	}
	
	

}
