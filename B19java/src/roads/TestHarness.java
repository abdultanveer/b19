package roads;

public class TestHarness {
	
	public static void main(String[] args) {
		Junction junction = new Junction();
		
		Road eastRoad =  new Road(junction, 10, "east");
		eastRoad.start();
		
		Road westRoad =  new Road(junction, 1, "west");
		westRoad.start();
		
		Road northRoad =  new Road(junction, 100, "north");
		northRoad.start();
		
		Road southRoad =  new Road(junction, 1000, "south");
		southRoad.start();
	}

}
