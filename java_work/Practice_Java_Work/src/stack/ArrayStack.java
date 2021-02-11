package stack;

public class ArrayStack<T> implements StackADT<T>{
	   // declare instance fields (stack and counter)
	private T[] stack = (T[]) (new Object[70]);
	private int stackCounter;
	
	public ArrayStack()
	{
		stackCounter = 0;
	}   // end constructor ArrayStack
	
	public boolean full()
	{
		// is the stack full?
		if(stackCounter == stack.length){
			return true; // stack is full!
		}
		else{
			return false; // stack is NOT full yet!
		}
		
	}   // end method full
	
	public boolean notEmpty()
	{
		// is the stack empty?
		if(stackCounter != 0){
			
			return true; // stack is not empty!
		}
		else{
			
			return false; // stack is empty!
		}
		
	}   // end method notEmpty
	
	public void push (T element)
	{
		// push the character onto the stack and then 
		// increment the number of elements on the 
		// stack by one
		stack[stackCounter] = element;
		stackCounter++; 
		System.out.println("Pushed: " + element);
	}   // end method push
	
	public T pop()
	{
		T oneItem;
		
		// decrement the 'stackCounter' by one
		// and then pop off the stack the current item
		// and then return this item
		--stackCounter;
		oneItem = stack[stackCounter];
		System.out.println("Popped: " + oneItem);
		return oneItem;
		
	}   // end method pop
	
}   // end class ArrayStack

