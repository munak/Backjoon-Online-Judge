import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] matrix;
	static int[] visitb;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int computer = sc.nextInt();
		matrix = new int[computer][computer];
		visitb = new int[computer];
		int line = sc.nextInt();
		
		for(int i = 0; i < line; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			matrix[x - 1][y - 1] = 1;
			matrix[y - 1][x - 1] = 1;
		}
		
		bfs(0, computer);
		
		sc.close();
		
	}
	
	static void bfs(int v, int dot) {
		visitb[v] = 1;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		
		int result = 0;
		
		while(!queue.isEmpty()) {
			v = queue.poll();
			result++;
			
			for(int i = 0; i < dot; i++) {
				if(matrix[v][i] == 1 && visitb[i] != 1) {
					visitb[i] = 1;
					queue.offer(i);
				}
			}
		}
		
		System.out.println(result - 1);
	}
}
