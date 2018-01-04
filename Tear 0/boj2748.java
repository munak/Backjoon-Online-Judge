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
		
		fibonacci(num);
		System.out.println(memo[num]);
	}
	
	static long fibonacci(int n) {
		if(n <= 1) {
			return memo[n] = n;
		} else if(memo[n] != -1) {
			return memo[n];
		} else {
			return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
