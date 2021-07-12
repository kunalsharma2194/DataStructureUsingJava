package BinaryTree;

public class PreeOrderTraversal {
	Node root;

    void preOrder(Node root) {
    	if(root==null)
    		return;
    	
    	else
    	{
    		System.out.print(root.data+" ");
    		
    		preOrder(root.left);
    		preOrder(root.right);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PreeOrderTraversal m=new PreeOrderTraversal();
     m.root=new Node(1);
     m.root.left=new Node(2);
     m.root.right=new Node(3);
     m.root.left.left=new Node(4);
     m.root.right.left=new Node(5);
     m.root.right.right=new Node(6);
     m.root.right.left.left=new Node(7);
     m.root.right.left.right=new Node(8);
     m.preOrder(m.root);
	}

}
