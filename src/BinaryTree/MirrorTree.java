package BinaryTree;

public class MirrorTree {
	Node root,root1;
	
	public void mirror(Node root,Node root1) {
	
		if(root==null)
			return;
		
		mirror(root.left,root1);
		
		System.out.print(root.data+" ");
		mirror(root.right,root1);
		
	}
   public static void main(String[] args) {
	
	 MirrorTree tree=new MirrorTree();
	 tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);
     tree.root.left.right.left = new Node(6);
     
     tree.mirror(tree.root,tree.root1);
}
}
