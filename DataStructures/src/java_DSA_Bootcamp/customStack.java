package java_DSA_Bootcamp;

public class customStack {
	protected int[] data;
	private final int defaultSize = 10;
	protected int top = -1;
	
	public customStack() {
		this.data = new int[defaultSize];
	}
	
	public customStack(int size) {
		this.data = new int[size];
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		this.data[++top] = item;
	}
	
	public Integer pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		}
		return this.data[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == this.data.length-1;
	}
	
	public Integer peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		return this.data[top];
	}
//	public static void main(String[] args) {
//		
//	}

}












