package roads;

public class Road extends Thread {
	
	Junction junction;
	int vehicles;
	String roadName;

	public Road(Junction junction, int noVehicles,String name) {
		this.junction = junction;
		vehicles = noVehicles;
		roadName = name;
		Thread.currentThread().setName(name);
	}
	
	@Override
	public void run() {
		junction.passVehicles(roadName,vehicles);
	}
	
	

}
