import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int re = (n / 10 + n % 10) % 10 + 10 * (n % 10);
		int st = 1;
		
		while(re != n) {
			re = (re / 10 + re % 10) % 10 + 10 * (re % 10);
			st++;
		}
		
		System.out.println(st);
	}
}
