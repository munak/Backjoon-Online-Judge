import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt(), result = 0;
		int[] arr = new int[len], dp = new int[len + 1];
		
		for(int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 1; i <= len; i++) {
			int max = 0;
			
			for(int j = 1; j < i; j++) {
				
				if(arr[i - 1] > arr[j - 1]) {
					max = (max > dp[j]) ? max : dp[j];
				}
			}
			
			dp[i] = max + 1;
			
			result = (result > dp[i]) ? result : dp[i];
		}
		
		System.out.println(result);
	}
}
