import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		while(--count >= 0) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
		
		sc.close();
	}
}
