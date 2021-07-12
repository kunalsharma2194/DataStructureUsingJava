package BinaryTree;

public class HeightOfTree {
   
	Node root;
    HeightOfTree(){
    	root=null;
	}
      int heightofTree(Node node) {
    	if(node==null)
    	  return 0;
    	else
    	{
    		int lheight=heightofTree(node.left);
    		int rheight=heightofTree(node.right);
    		
    		if(lheight>rheight)
    			
				return (lheight+1);
			else return(rheight+1);

    		
    	}
    }
	public static void main(String[] args) {
		HeightOfTree m1=new HeightOfTree();
		m1.root=new Node(2);
//		m1.root.left=new Node(2);
		m1.root.right=new Node(3);
		m1.root.right.left=new Node(1);
	   System.out.println(m1.heightofTree(m1.root));
	}
}
