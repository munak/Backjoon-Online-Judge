import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			int next = sc.nextInt();
			sum += (next < 40)? 40:next;
		}
		
		sc.close();
		
		System.out.println(sum/5);
	}
}
