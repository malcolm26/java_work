package stack;

public class Stack {

	int stack[] = new int[8];
	int top = 0;
	public void push(int data) {
		stack[top] = data;
		top++;
	}
	
	public int pop() {
		int data;
		top--;
		data = stack[top];
		/* deletes the element */ 
		stack[top] = 0;
		return data;
		
	}
	
	public int peek() {
		int data;
		
		data = stack[top-1];
		return data;
		
	}
	
	public void show() {
		for(int a : stack) {
			System.out.print(a + " ");
		}
	}
}
