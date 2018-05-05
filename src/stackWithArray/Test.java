package stackWithArray;

public class Test {

	public static void main(String[] args) {
		
		StackArray sa=new StackArray(3);
		
		sa.push(4);
		sa.push(7);
		sa.push(5);
		
		sa.printStack();
		System.out.println("*******");
		System.out.println(sa.peek());
		System.out.println("*******");
		System.out.println(sa.pop());
		System.out.println("*******");
		sa.printStack();
		

	}

}
