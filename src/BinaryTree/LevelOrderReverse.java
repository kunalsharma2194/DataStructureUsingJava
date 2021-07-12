package BinaryTree;

public class LevelOrderReverse {
	Node root;
	void ZigZag(Node root) {
	  int h=height(root);
		for (int i = 1; i <=h; i++) {
			traversal(root,i);
		}
	}
	
	void traversal(Node root,int level) {
		if(root==null)
			return;
		
		if(level==1)
			System.out.print(root.data+" ");
		
		else if(level>1)
		{
			traversal(root.right,level-1);
		    traversal(root.left,level-1);
		}
	}
	
	
	int height(Node node) {
		if(node==null)
			return 0;
		
		int lheight=height(node.left);
		int rheight=height(node.right);
		
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight+1;
	}
	
public static void main(String[] args) {
	LevelOrderReverse tree=new LevelOrderReverse();
	 tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(7);
     tree.root.left.right = new Node(6);
     tree.root.right.left = new Node(5);
     tree.root.right.right = new Node(4);
	 tree.ZigZag(tree.root);
}
}
