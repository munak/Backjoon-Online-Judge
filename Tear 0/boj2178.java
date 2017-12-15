import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] direction = {{1,0,-1,0},{0,-1,0,1}}; //right, down, left, up
	static int[][] maze;
	static int row, col;
	static Queue<int[]> queue;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		row = sc.nextInt();
		col = sc.nextInt();
		maze = new int[row][col];
		queue = new LinkedList<int[]>();
		
		for(int i = 0; i < row; i++) {
			String num = sc.next();
			for(int j = 0; j < num.length(); j++) {
				maze[i][j] = num.charAt(j) - 48;
			}
		}
		
		sc.close();
		
		maze[0][0]++;
		queue.offer(new int[]{0,0});
		bfs(0,0);
		
		System.out.println(maze[row - 1][col - 1] - 1);
	}
	
	static void bfs(int x, int y) {
		while(!queue.isEmpty()) {
			int[] start = queue.poll();
			int pathValue = maze[start[0]][start[1]];
			for(int i = 0; i < 4; i++) {
				int nx = start[0] + direction[0][i], ny = start[1] + direction[1][i];
				
				if(nx < 0 || nx >= row || ny < 0 || ny >= col) {
					continue;
				}
				
				if(maze[nx][ny] == 1) {
					maze[nx][ny] = pathValue + 1;
					queue.offer(new int[]{nx,ny});
				}
			}
		}
	}
}
