package BinaryTree;

public class LeftView {

	Node root;
	static int max_level=0;
	void leftView(Node root,int level) {
		
		if(root==null)
			return;
		if(max_level<level)
		{
    		  System.out.print(root.data+" ---->");
		      max_level=level;
		      System.out.println(max_level+" ");
		}
		
		leftView(root.left,level+1);
		leftView(root.right,level+1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LeftView m=new LeftView();
    m.root=new Node(1);
    m.root.left=new Node(2);
    m.root.right=new Node(3);
    m.root.left.left=new Node(4);
    m.root.left.right=new Node(5);
    m.root.right.left=new Node(6);
    m.root.right.left=new Node(7);
    m.root.left.left.right=new Node(8);
    m.leftView(m.root,1);
	}

}
