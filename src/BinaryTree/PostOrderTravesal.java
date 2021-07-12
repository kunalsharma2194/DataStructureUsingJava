package BinaryTree;

public class PostOrderTravesal {
 
	Node root;
	
	void postOrder(Node root) {
		if(root==null) {
			return;
		}
		else
		{
			postOrder(root.left);
			postOrder(root.right);
			
			System.out.print(root.data+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PostOrderTravesal m=new PostOrderTravesal();
     m.root=new Node(1);
     m.root.left=new Node(2);
     m.root.right=new Node(3);
     m.root.left.left=new Node(4);
     m.root.right.left=new Node(5);
     m.root.right.right=new Node(6);
     m.root.right.left.left=new Node(7);
     m.root.right.left.right=new Node(8);
     m.postOrder(m.root);
	}

}
