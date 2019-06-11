package threads;

public class MyTestHarness {
	
	public static void main(String[] args) {
		Table table = new Table(); ///shared resource
		
		FirstThread firstThread = new FirstThread(table);
		firstThread.start();
		
		SecondThread secondThread = new SecondThread(table);
		secondThread.start();
		
		ThirdThread thirdThread = new ThirdThread(table);
		thirdThread.start();
		
	}

}
