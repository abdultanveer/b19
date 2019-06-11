package threads;

public class ThirdThread extends Thread {
	Table table;

	public ThirdThread(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(1000);
	}
	
	

}
