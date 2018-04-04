import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		int sum = 0;
		sc.close();

		for(int i = 1; i <= in; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
