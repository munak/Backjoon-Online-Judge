import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		
		sc.close();

		for(int i = in; i >= 1; i--) {
			for(int j = 0; j < in - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}