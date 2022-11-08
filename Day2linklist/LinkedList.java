package Day2linklist;

class Node {
    private int data;
    private Node next;
    Node head;
    Node tail;
    
    Node(int d)
    {
        this.data = d;
       this.next = null;
    }
    
    public Node (int data, Node next)
    {
    	this.data = data;
    	this.next = null;
    }
    
    public Node getnext()
    {
    	return next;
    }
    
    public int getData() {
		return data;
    }
    
    public void setNext(Node next) 
    {
    }
    
    public void insertBeginning() {
    	
    }
    
    public void insertEnd(int data)
    {
    	
    }
    
    public void inserAfter(Node p, int data)
    {
    	Node temp = new Node(data);
    	temp.setNext(p.grtNext());
    	p.setNext(temp);
    	if(tail==p) tail= temp;
    }
    
    
    public void insertBefore(Node B, int data)
    {
    	Node temp = new Node(data);
    	
    	
    }
    
    public void traverse()
    {
    	if (!isEmpty()) {
    		node temp = haed;
    		do {
    			System.out.println(temp.getItem());
    			temp = temp.getNext();
    		}
    	}
    	
    }
    
    
    }
public class LinkedList 
{
	
	

	
	
}
