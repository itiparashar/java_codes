package queue;

import stack.StackArray;

public class QueueArray
{
	private static int[] storage;
	private int first;
	private int last;
	private int capacity;
	
	
	public QueueArray(int n) {
		int capacity = 9;
		storage = new int[capacity];		
	}
	
//	public void clear()
//	{
//		
//	}
	
	
	public boolean isEmpty()
	{
		if (first == last+1)
		{
			System.out.println("empty queue");
		}
		return true;
	}
	
	public boolean isFull() {
		return (last >= storage.length-1); 
	}
	public void enqueue(int data)// put element at the end of the queue
	{
	        // check queue is full or not
	        if (capacity == last) {
	            System.out.printf("Queue is full");
	            return;
	        }
	 
	        // insert element at the rear
	        else {
	            storage[last] = data;
	            last++;
	        }
	        return;
	    
	}
	
	public void dequeue()//remove first element from queue
	{
		 if (first == last) {
	            System.out.printf("\nQueue is empty\n");
	            return;
	        }
	 
	        // shift all the elements from index 2 till last
	        // to the right by one
	        else {
	            for (int i = 0; i < last - 1; i++) {
	                storage[i] = storage[i + 1];
	            }
	 
	            // store 0 at last indicating there's no element
	            if (last < capacity)
	                storage[last] = 0;
	 
	            // decrement last
	            last--;
	        }
	        return;
	}
	
	public int firstEl()
	{
		return first;
	}
	public static void main (String[] args) throws Exception {
		QueueArray qa = new QueueArray(3);
		
		qa.enqueue(11);
		qa.enqueue(22);
		qa.enqueue(23);
		
		qa.dequeue();
		qa.dequeue();
	
	
		
		
		System.out.println(storage[2]);
		
	}
}
