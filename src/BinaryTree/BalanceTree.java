package BinaryTree;
import java.util.*;
public class BalanceTree {

	Node root;
	
	public boolean balanced(Node node){
	   
		int lh;//heights of the subtree
		int rh;
		
		
		if(node==null)
			return true;
		
		lh=height(node.left);
		rh=height(node.right);
		
		int gap=Math.abs(lh-rh);
		if(gap<=1&& balanced(node.left)&& balanced(node.right))
			return true;
		
		return false;
	}
	
	int height(Node temp) {
		if (temp==null)
			return 0;
		
		return 1+Math.max(height(temp.left),height(temp.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BalanceTree tree= new BalanceTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.right = new Node(6);
    tree.root.left.left.left = new Node(7);
	
    
    if(tree.balanced(tree.root)) {
    	System.out.println("YES");
    }
    else 
    {
    	System.out.println("No");
    }
	}

}
