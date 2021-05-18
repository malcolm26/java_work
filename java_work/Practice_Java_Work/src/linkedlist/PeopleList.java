package linkedlist;

public class PeopleList {
	// declare 'list' to be a pointer
	// that will point to the beginning
	// of a linked list
	private PersonNode list;
	
	private class PersonNode
	{
			// info part of a node
		public Person aPerson;
		
			// will point to the next
			// node in the linked list
		public PersonNode next;
		
		public PersonNode(Person newPerson)
		{
				// create info part of node
			aPerson = newPerson;
			
				// currently next does not
				// point to anything
			next = null;
		} // end constructor PersonNode
		
	} // end class PersonNode
	
	/*]
	 * establishes an empty linked list
	 */
	public PeopleList(){
		list = null;
	} // end constructor PeopleList
	
	public void add(Person newPerson){
			// instantiate a new mode, pass
			// info object about that person
		PersonNode node = new PersonNode(newPerson);
		
			// create a pointer that will be
			// able to point to any node in
			// the linked list
		PersonNode current;
		
			// if the linked list is empty, 
			// this node will become the 
			// first node in the linked list
		if(list == null){
			list = node;
			System.out.println("This Person was added " + 
			"to the linked list: " + node.aPerson);
			
		} else {		
				/*
				 * linked list has at least one node in it
				 * 
				 * point to the beginning of
				 * the linked list to begin
				 * traversing the linked list
				 */
			current = list;
			
				/*
				 * traverse the entire linked
				 * list until you have reached the end
				 */
			while(current.next != null){
				current = current.next;
			} // end while loop
			
				// make new node to be the last 
				// node in the linked list
			current.next = node;
			
			System.out.println("This person was " + 
							"added to the linked list: " + node.aPerson);
			
		} // end else statement
		
	} // end add method
	
	public String printList()
	{
		String result;
		PersonNode current; 
		
		result = "Here is the current linked list:\n\n";
		
			/**
			 * assign 'current' to point to
			 * the beginning of the line
			 */
		current = list;
		
			/**
			 * traverse the linked list until
			 * we have reached the end
			 */
		while(current != null)
		{
				// build info about this node
			result = result + current.aPerson + "\n";
			
				// move on to the next node
				// in the linked list
			current = current.next;
		} // end while loop
		
			// return string 'result' which represents 
			// the entire linked list
		return result;
		
	} // end method printList
	
}	// end class PeopleList
