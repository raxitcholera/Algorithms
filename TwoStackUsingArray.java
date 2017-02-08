public class TwoStackUsingArray {
	private int [] elements = new int[8];
	private int head = -1;
	public static void main (String[] args){
		StackUsingArray stack = new StackUsingArray();
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(4);
		stack.push(6);
		stack.push(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	public boolean isEmpty() {
		return head < 0;
	}
	public int pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return elements[head--];

	}
	public void push(int data) {
		if (head == elements.length-1)
			throw new RuntimeException("Stack is full");
		elements[++head] = data;

	}
	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return elements[head];
	}
}