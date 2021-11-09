package queue.implementation;
import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	
	private List<String> queuelist;
	
	int rear, front;
	
	String name, nm;
	
	public MyQueue()
	{
		queuelist = new ArrayList<String>();
		rear = 0;
		front = 0;
		name = null;
		
	}
	
	public void enqueue(String nm)
	{
		queuelist.add(rear, nm);
		System.out.println("\n"+nm+" added to the queue");
		rear++;
		
		
	}
	
	public void dequeue()
	{
		if (rear==front)
		{
			System.out.println("\nUNDERFLOW");
		}
		else
		{
			name=queuelist.remove(front);
			rear--;
			System.out.println("\n"+name+" removed from the queue");
		}
		
	}
	
	public void peek()
	{
		if(rear==front)
		{
			System.out.println("\nUNDERFLOW");
			
		}
		else
		{
			nm = queuelist.get(front);	
			System.out.println("\nPEEKED ELEMENT = "+nm);
		}
		
	}
	
	public void display()
	{
		if (rear==front)
		{
			System.out.println("\nUNDERFLOW");
			
		}
		else 
		{
			System.out.println("\nTHE ELEMENTS IN THE QUEUE ARE:");
			for(int i=0;i<queuelist.size();i++)
			{
				nm = queuelist.get(i);
				System.out.println("\n"+nm);
				
			}
		}
		
	}
	
	

}
