import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int num;
	static int[][] cities;
	static int min;
	static Boolean[] visit;
	static int count;
	static int len;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		cities = new int[num][num];
		min = Integer.MAX_VALUE;
		visit = new Boolean[num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				cities[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i = 0; i < num; i++) {
			Arrays.fill(visit, false);
			count = 0;
			len = 0;
			dfs(i, i);
		}

		System.out.println(min);
	}
	
	static void dfs(int v, int start) {
		visit[v] = true;
		int temp;
		
		for(int i = 0; i < num; i++) {
			if(visit[i] != true && cities[v][i] > 0) {
				count++;
				len += cities[v][i];
				dfs(i, start);
				len -= cities[v][i];
			} else if(visit[i] == true && cities[v][i] > 0 && i == start && count == num - 1) {
				if(len + cities[v][i] < min) {
					min = len + cities[v][i];
				}
			}
		}
		visit[v] = false;
		
		count--;
	}
}
