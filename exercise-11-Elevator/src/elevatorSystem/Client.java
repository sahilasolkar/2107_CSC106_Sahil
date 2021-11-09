package elevatorSystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Floor[] floors = {new Floor(0),
		          new Floor(1), 
				  new Floor(2),
				  new Floor(3),
				  new Floor(4),
				  new Floor(5)};
		
		
		
		
		
		Elevator elevator1 = new Elevator();
		Elevator elevator2 = new Elevator();
		
		Building b1 = new Building(floors, elevator1, elevator2);
		
		
		ElevatorSystem elesystem = new ElevatorSystem();
		
		elesystem.gotofloor(elevator1, 2);
		elesystem.processRequest(elevator1, b1.floors);
		

		
		elesystem.requestdown(1, b1.floors, elevator1);
		
		//elesystem.processRequest(elevator1, b1.floors);
		elesystem.processRequest(elevator1, b1.floors);
		//elesystem.processRequest(elevator1, b1.floors);
		elesystem.requestup(3, b1.floors, elevator1);
		
		elesystem.processRequest(elevator1, floors);
		
		elesystem.gotofloor(elevator1, 4);
		//elesystem.gotofloor(elevator1, 4);
		//int i;
		//i=elevator1.currentfloor;
		//
		//System.out.println(i);
		elesystem.processRequest(elevator1, b1.floors);
	}
	
	
	
	
	
	
	

}
