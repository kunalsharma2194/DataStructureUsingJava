package BinaryTree;
//Level order traversal
public class Binarytreetraversal {

	Node root;
	  public Binarytreetraversal() {
		root=null;
	  }
	
	void printLevelOrder() {
		int h= height(root);
		System.out.println(h);		 
		for (int i = 1; i <=h; i++) {
			
		printCurrentLevelOrder(root, i);	
		
		}
	}
	void printCurrentLevelOrder(Node root,int level) {
		if(root==null)
			return;
		if(level==1) {
			System.out.print(root.data+ " ");
		}
		else if(level >1)
		{
			printCurrentLevelOrder(root.left, level-1);
			printCurrentLevelOrder(root.right, level-1);
		}
	}
	 int height(Node root) {
		if(root==null)
			return 0;
		else
		{
			int lheight=height(root.left);
			int rheight=height(root.right);
			
			if(lheight>rheight) 
				return (lheight+1);
			 else return(rheight+1);
		}
	}
	
	public static void main(String[] args) {
		Binarytreetraversal m=new Binarytreetraversal();
		m.root=new Node(1);
	    m.root.left=new Node(2);
	    m.root.right=new Node(3);
	    m.root.left.left=new Node(4);
		  
//	    m.traversal();	
		  System.out.println("Level order traversal of binary tree is ");
		  m.printLevelOrder();
	}
}
  class Node{
    int data;
    Node left,right;
	public Node(int item) {
		data=item;
		left=null;
		right=null;
	}
}