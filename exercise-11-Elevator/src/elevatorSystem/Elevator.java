package elevatorSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
	
	//variables for internal system
	int currentfloor;
	String state;
	String direction;
	
	//variables for external system
	int targetfloor;
	int sourcefloor;
	
	Queue<Integer> queueup;
	Queue<Integer> queuedown;
	
	Queue<String> queuedir;
	
	
	
	public Elevator() {
		super();
		this.direction = "stationary";
		this.currentfloor = 0;
		this.state = "stop";
		this.targetfloor = 0;
		this.sourcefloor = 0;
		
		this.queueup = new LinkedList<Integer>();
		this.queuedown = new LinkedList<Integer>();
		
		this.queuedir = new LinkedList<String>();
		
		System.out.println("elevator created");
	
		
	}

	
	


}
