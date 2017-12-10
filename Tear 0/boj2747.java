import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long[] memo;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		memo = new long[num + 1];
		Arrays.fill(memo, -1);
		sc.close();
		
		memo[0] = 0;
		memo[1] = 1;
		
		for(int i = 2; i < num + 1; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		
		System.out.println(memo[num]);
	}
}
