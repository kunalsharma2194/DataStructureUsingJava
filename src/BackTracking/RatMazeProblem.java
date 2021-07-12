package BackTracking;

public class RatMazeProblem {

	
	
	public void MazeProblem1(int[][] mat,int n,String str,int row,int col,boolean[][] vis) {

		if(row<0 ||col<0||row>=n||col>=n||mat[row][col]==0|| vis[row][col]==true) {
			return;
		}
		
		if(row==n-1 &&col==n-1) {
			System.out.println(str);
			return;
		}
		vis[row][col]=true;
		MazeProblem1(mat, n, str+"R", row, col+1,vis);
		MazeProblem1(mat, n, str+"L", row, col-1,vis);
		MazeProblem1(mat, n, str+"U", row-1, col,vis);
		MazeProblem1(mat, n, str+"D", row+1, col,vis);
		vis[row][col]=false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RatMazeProblem rat=new RatMazeProblem();
    
    int[][] mat= {{1, 0, 0, 0},
                  {1, 1, 0, 1}, 
                  {1, 1, 0, 0},
                  {0, 1, 1, 1},
                 };
    boolean[][] vis=new boolean[4][4];
     rat.MazeProblem1(mat,4,"",0,0,vis);
    System.out.println("Hello");
}
	
}
