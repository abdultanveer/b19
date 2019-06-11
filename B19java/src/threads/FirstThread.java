package threads;

public class FirstThread extends Thread {
	Table table;

	public FirstThread(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(10);
	}
	
	

}
