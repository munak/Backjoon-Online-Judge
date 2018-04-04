import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long[] memo;
	static long min;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		min = Integer.MAX_VALUE;
		memo = new long[num + 1];
		Arrays.fill(memo,  Integer.MAX_VALUE);
		memo[1] = 0;
		sc.close();
		
		for(int i = 2; i < num + 1; i++) {
			if(i % 3 == 0 && memo[i] > memo[i / 3] + 1) {
				memo[i] = memo[i / 3] + 1;
			}
			
			if(i % 2 == 0 && memo[i] > memo[i / 2] + 1) {
				memo[i] = memo[i / 2] + 1;
			}
			
			if(memo[i] > memo[i - 1] + 1) {
				memo[i] = memo[i - 1] + 1;
			}
		}
		
		System.out.println(memo[num]);
	}
}
