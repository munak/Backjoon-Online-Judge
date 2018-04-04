import java.util.Scanner;

public class Main {
	static int[] memo;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		memo = new int[num + 1];
		memo[0] = 1;
		memo[1] = 1;
		
		sc.close();
		
		for(int i = 2; i <= num; i++) {
			memo[i] = (memo[i - 1] + memo[i - 2]) % 10007;
		}
		
		System.out.println(memo[num]);
	}
}
