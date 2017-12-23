import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] stais = new int[count + 1];
		int[] dp = new int[count + 1];
		
		for(int i = 1; i <= count; i++) {
			stais[i] = sc.nextInt();
		}
		
		sc.close();
		
		dp[0] = 0;
		
		for(int i = 1; i <= count; i++) {
			if(i < 3) {
				dp[i] = stais[i] + stais[i - 1];
			} else {
				dp[i] = (stais[i] + dp[i - 2] > stais[i] + stais[i - 1] + dp[i - 3]) ? stais[i] + dp[i - 2]:stais[i] + stais[i - 1] + dp[i - 3];
			}
		}
		
		System.out.println(dp[count]);
	}
}
