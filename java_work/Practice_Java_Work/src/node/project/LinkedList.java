package node.project;

public class LinkedList {
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	/*
	 * Inserts a new node into the list
	 */
	public void insert(String str) {
		Node node = new Node(str, null);
		node.str = str;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	/*
	 * Displays the current list
	 */
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.str + " ");
			node = node.next;
		}
		System.out.println(node.str);
	}
	
	/*
	 * inserts new node at the front of the list
	 */
	public void push(String str) {
		Node node = new Node(str, null);
		node.str = str;
		node.next = null;
		
		node.next = head;
		head = node;
	}
	
	/*
	 * Inserts new node at a certain point on the linked list
	 */
	public void insertAt(int pos, String s) {
		Node node = new Node(s, null);
		node.str = s;
		node.next = null;
		
		//if there is nothing in the list, insert it to the front
		if(pos == 0) {
			push(s);
		}
		else {
			Node n = head;
			for(int i = 0; i < pos-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		
	}
	
	public void pop(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1 " + n1.str + " deleted");
		}
	}
	
	/*
	 * finds the node on the list
	 */
	public int peek(int n) {
		// 1. maintain a current node.
		Node current = head;
		int count = 0;
		// 2. to move forward update the current node by setting it to the next one.
		while(count < n) {
			current = current.getNext();
			if(current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + n);
			}
			count++;
		}
		return current.getData();
	}
	
	
	
}
