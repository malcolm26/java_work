package node.project;


public class Node {

	int data;
	String str;
	Node next;
	
	public Node(String s, Node nx) {
		str = s;
		next = nx;
	}
	
	/*public Node() {
		this.str = str;
		this.next = null;
	}
*/
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
