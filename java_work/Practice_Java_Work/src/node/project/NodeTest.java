package node.project;


public class NodeTest {

	/*static int countNodes(Node head) {
        // assuming that head != null
        int count = 1;
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            count += 1;
        }
        return count;
    }*/
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert("b");
		list.insert("c");
		list.insert("d");
		list.insert("e");
		list.push("a");
		list.push("m");
		list.insert("9");
		list.insert("i");
		list.insert("x");
		list.insertAt(3, "u");
		list.insertAt(5, "t");
		list.pop(0);
		list.push("4");
		list.show();
		
		//System.out.print(list.find(2));
		/*Node x = new Node(6, null);
		Node y = new Node(3, x);
		Node z = new Node(4, y);
		Node v = new Node(2, z);
		Node a = new Node(1, v);
		Node b = new Node(5, a);
		
		
		Node middle = a.getNext().getNext();
		
		
	
		System.out.println(a.getData());
		System.out.println(a.getNext().getData());
		System.out.println(a.getNext().getNext().getData());*/
		
		


	}

}
