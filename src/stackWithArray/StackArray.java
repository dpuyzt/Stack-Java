package stackWithArray;

public class StackArray {
	private int size;
	private int [] stackArr;
	private int top;
	
	public StackArray(int size) {
		this.size=size;
		stackArr=new int[size];
		this.top=-1;
	}
	
	public void push(int data) {
		if(top<size) {
			stackArr[++top]=data;
		}
	}
	
	public int pop() {
		return stackArr[top--];
	}
	
	public int peek() {
		return stackArr[top];
	}
	
	public void printStack() {
		for(int i=top;i>=0;i--) {
			System.out.println(stackArr[i]+ " ");
		}
	}

}
