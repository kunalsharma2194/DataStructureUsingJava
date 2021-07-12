package BinaryTree;

public class InorderTraversal {
      Node root;
      
      void inorder(Node root) {
    	  if(root==null)
    		  return;
    	  
    	  else
    	  {
    		  inorder(root.left);
    		  
    		  System.out.print(root.data+ " ");
    		  
    		  inorder(root.right);
    	  }
      }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
      InorderTraversal m=new InorderTraversal();
       m.root=new Node(1);
       m.root.left=new Node(2);
       m.root.right=new Node(3);
       m.root.left.left=new Node(4);
       m.root.right.left=new Node(5);
       m.root.right.right=new Node(6);
       m.root.right.left.left=new Node(7);
       m.root.right.left.right=new Node(8);
       m.inorder(m.root);
	}

}
