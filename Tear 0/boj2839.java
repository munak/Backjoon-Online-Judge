import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		int count = val / 5;

		sc.close();
		
		for(int i = count; i >= 0; i--) {
			int a = 5 * i;
			int b = 3 * ((val - a) / 3);

			if(a + b == val) {
				System.out.println(i + (val - a) / 3);
				return;
			}
		}
		
		System.out.println(-1);
	}
}
