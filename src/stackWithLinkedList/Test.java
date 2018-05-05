package stackWithLinkedList;

public class Test {

	public static void main(String[] args) {
		Stackk stack = new Stackk();
		
		stack.push(4);
		stack.push(41);
		stack.push(11);
		
		stack.printStack();
		
		System.out.println("*******");
		System.out.println(stack.pop());
		System.out.println("*******");
		stack.printStack();
		
		System.out.println("*******");
		
		System.out.println(stack.peek());
		

	}

}
