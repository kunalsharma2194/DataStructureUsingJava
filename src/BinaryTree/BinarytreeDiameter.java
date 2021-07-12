package BinaryTree;

public class BinarytreeDiameter {

	Node root;
	
    int diameter(Node root) {
    	
    if(root==null) 	
     return 0;
    
    int lheight=height(root.left);
    int rheight=height(root.right);
    
    int ldiameter=diameter(root.left);
    int rdiameter=diameter(root.right);
    
    
    return Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter));
    }
    
    static int  height(Node node) {
    	
    	if(node==null)
    		return 0;
    	
    	return (1+Math.max(height(node.left),height(node.right)));
    }
    int diameter() {
    	return diameter(root);
    }
	public static void main(String[] args) {
		BinarytreeDiameter tree=new BinarytreeDiameter();
		 tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.left.right.left = new Node(6);
		
	     
	    System.out.println("The diameter of the binary tree is :"+tree.diameter());
	}
}

