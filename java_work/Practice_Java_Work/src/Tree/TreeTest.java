package Tree;

public class TreeTest {

	
	static int sumValues(Node root) {
		int total = 0;
		if(root == null) {
			return 0;
		}
		total = root.data + sumValues(root.left) + sumValues(root.right);
		
		return total;
		
		
	}
	
	 static void printPreOrder(Node root) {
    	if(root == null) {
    		return;
    	}
    	
    	System.out.println(root.data);
    	printPreOrder(root.left);
    	printPreOrder(root.right);
     }
	 static void printInOrder(Node root) {
	    	if(root.left != null) {
	    		printInOrder(root.left);
	    	}
	    	System.out.println(root.data);
	    	if(root.right != null) {
	    		printInOrder(root.right);
	    	}
	    	//System.out.println(data);
	    }
	 static void printPostOrder(Node root) {
	    	if(root == null) {
	    		return;
	    	}
	    	printPostOrder(root.left);
	    	printPostOrder(root.right);
	    	System.out.println(root.data);
	 }
	 static void insert(Node root, int value) {
	    	if(value <= root.data) {
	    		if(root.left == null) {
	    			root.left = new Node(value);
	    		} else {
	    			root.left.insert(value);
	    		}
	    	}
	    	else {
	    		if(root.right == null) {
	    			root.right = new Node(value);
	    		} else {
	    			root.right.insert(value);
	    		}
	    	}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        //Node node5 = new Node(5);
        //Node node6 = new Node(6);
        //Node node7 = new Node(7);
        //Node node8 = new Node(8);

        node2.left = node3;
        node2.right = node4;
        
        //node3.insert(5);
        insert(node3, 5);
        insert(node3, 6);
        insert(node3, 7);
        
        insert(node4, 8);
        insert(node4, 9);
        insert(node4, 11);
        insert(node3, 10);
        
        //node3.insert(10);
        //node4.insert(7);
        
       
       
        //node2.printInOrder();
        printInOrder(node2);
        System.out.println("Sum of all values of this tree is: " + sumValues(node2));
        System.out.println("root node 2:");
        //printInOrder(node2);
        //System.out.println("root node 3:");
        //Inorder(node3);
        //System.out.println("root node 4:");
        //printPostOrder(node4);
        System.out.println(node2.contains(3));


	}

}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        this.data = item;
        //left = right = null;
    }
    
    
    void insert(int value) {
    	if(value <= data) {
    		if(left == null) {
    			left = new Node(value);
    		} else {
    			left.insert(value);
    		}
    	}
    	else {
    		if(right == null) {
    			right = new Node(value);
    		} else {
    			right.insert(value);
    		}
    	}
    }
    boolean contains(int value) {
    	if(value == data) {
    		return true;
    	}
    	else if (value < data){
    		if(left == null) {
    			return false;
    		} else {
    			return left.contains(value);
    		}
    	}
    	else {
    		if(right == null) {
    			return false;
    		} else {
    			return right.contains(value);
    		}
    	}
    }
    
    
}
