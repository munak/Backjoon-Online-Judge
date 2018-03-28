import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt(), max = sc.nextInt();
		int[] dp = new int[max + 1];
		dp[1] = 1;
		
		for(int i = 2; i <= max; i++) {
			for(int j = 2; i * j <= max; j++) {
				dp[i * j] = 1;
			}
		}
		
		for(int i = min; i <= max; i++) {
			if(dp[i] == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
