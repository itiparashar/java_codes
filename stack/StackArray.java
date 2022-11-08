package stack;

public class StackArray {
	private int[] storage;
	private int top; //Will refer to the top most element in the array;
	
	public StackArray(int n) {
		int size = n; 
		storage = new int[size];
		top = -1;		
	}
	
	public void clear() {
		top = -1; 
	}
	
	public boolean isFull() {
		return (top >= storage.length-1); 
	}
	
	public boolean isEmpty() {
		return (top == -1); 
	}
	
	public void push (int el) throws Exception {
		if (!isFull()) {
			top++;
			storage[top] = el; 
		}
		else
			throw new Exception ("Stack is Full");
	}
	
	public int pop() throws Exception {
		if (!isEmpty()) {
			int tmp = storage[top];
			top --; 
			return tmp; 
		}
		else
			throw new Exception("Stack is Empty");
	}
	
	public int topEl() throws Exception {
		if (!isEmpty())
			return storage[top]; //Just send the top most element of the stack;
		else
			throw new Exception ("Stack is Empty"); 
	}
	
	public static void main (String[] args) throws Exception {
		StackArray sa = new StackArray(3);
		sa.push(11);
		sa.push(22);
		
		
		System.out.println(sa.pop());
	}

	
	
}
