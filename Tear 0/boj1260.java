import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int[][] matrix;
	static int[] visitd, visitb;
	static int dot;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		dot = sc.nextInt();
		int line = sc.nextInt(), start = sc.nextInt();
		matrix = new int[dot][dot];
		visitd = new int[dot];
		visitb = new int[dot];
		
		for(int i = 0; i < line; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			matrix[x - 1][y - 1] = 1;
			matrix[y - 1][x - 1] = 1;
		}
		
		sc.close();
		
		dfs(start - 1);
		System.out.println();
		bfs(start - 1);
	}
	
	static void dfs(int v) {
		visitd[v] = 1;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		System.out.print((v + 1) + " ");

		while(!stack.isEmpty()) {
			v = stack.peek();
			int i = 0;
			for(i = 0; i < dot; i++) {
				if(matrix[v][i] == 1 && visitd[i] != 1) {
					visitd[i] = 1;
					stack.push(i);
					System.out.print((i + 1) + " ");
					break;
				}
			}
			
			if(i == dot) {
				v = stack.pop();
			}
		}
	}
  
  /* recursion
  static void dfs(int v) {
		visitd[v] = 1;
		System.out.print((v + 1) + " ");
		for(int i = 0; i < dot; i++) {
			if(matrix[v][i] == 1 && visitd[i] != 1) {
				dfs(i);
			}
		}
	}
	*/
  
	static void bfs(int v) {
		visitb[v] = 1;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		
		while(!queue.isEmpty()) {
			v = queue.poll();
			System.out.print((v + 1) + " ");
			
			for(int i = 0; i < dot; i++) {
				if(matrix[v][i] == 1 && visitb[i] != 1) {
					visitb[i] = 1;
					queue.offer(i);
				}
			}
		}
	}
}
