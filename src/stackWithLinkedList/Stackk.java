package stackWithLinkedList;

public class Stackk {
	private Node head;
	private int count;
	
	public Stackk() {
		count=0;
		head=null;
	}
	
	public void push(int data) {
		Node tmp=new Node(data);
		tmp.setNextNode(head);
		head=tmp;
		count++;
	}
	
	public int pop() {
		Node newhead=head.getNextNode();
		int returned=head.getData();
		head=newhead;
		count--;
		return returned;
	}
	
	public int peek() {
		return head.getData();
	}
	
	public void printStack() {
		Node current=head;
		
		while(current !=null) {
			System.out.println(current.getData()+" ");
			current = current.getNextNode();
			
		}
	}
	
	public int getSize() {
		return count;
	}
	
	

}
