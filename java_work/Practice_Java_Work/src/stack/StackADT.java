package stack;

public interface StackADT<String> {
	
	/*
	 * Returns true if this stack is full
	 * @return boolean number whether or not this stack is empty
	 */
	public abstract boolean full();
	
	/*
	 * Returns true if this stack contains no elements 
	 * @return boolean number whether or not this stack is empty
	 */
	public abstract boolean notEmpty();
	
	/*
	 * Adds one element to the top of this stack
	 * @param element the element to be pushed onto stack
	 */
	public abstract void push(String element);
	
	/*
	 * Returns without removing the top element of this stack
	 * @return string removed from the top of stack
	 */
	public abstract String pop();
}
