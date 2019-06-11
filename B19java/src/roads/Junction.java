package roads;

public class Junction {

	public   void passVehicles(String name, int n) {
		System.out.println("this statment is not part of sync-- thread "+Thread.currentThread().getName());
		System.out.println("this statment is also not part of sync--" + Thread.currentThread().getName());

		synchronized (this) {


			for(int i=1; i<6; i++) {
				System.out.println("vehicles of "+Thread.currentThread().getName()+" road are passing-- vehicle no is "+n*i);

				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
