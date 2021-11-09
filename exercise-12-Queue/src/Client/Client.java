package Client;

import queue.implementation.MyQueue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyQueue queue = new MyQueue();
		
		queue.enqueue("joker");
		queue.enqueue("batman");
		
		queue.display();
		
		queue.dequeue();
		
		queue.display();
		
		queue.display();
		
		queue.peek();
		
		queue.dequeue();
		
		queue.display();
		
		queue.dequeue();
				

	}

}
