package Building;

import java.util.List;

public class BuildingBuilder {
	
	
	public BuildingBuilder(){
	}


	public Building buildHouse(String name) throws InterruptedException{
		System.out.println("Start building house , name: "+name);
		Thread.sleep(2000);
		System.out.println("Finsih building house , name: "+name);
		return (new House(name));
	}

	public Building buildCastle(String name) throws InterruptedException {
		System.out.println("Start building castle , name: "+name);
		Thread.sleep(5000);
		System.out.println("Finsih building castle , name: "+name);
		return (new Castle(name));
	}
	
	public void appendBuilding(List<Building> buildings ,Building building) throws InterruptedException{
		try{
			System.out.println("Add "+building.getName());
			Thread.sleep(3000);
			buildings.add(building);
			System.out.println("Complete Adding " + building.getName());
		}catch(InterruptedException e){
			System.out.println("Add "+building.getName());
			buildings.add(building);
			System.out.println("Complete Adding " + building.getName());
		}finally{
			
		}
	}

	
	
}