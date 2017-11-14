import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] in = new int[count];
		
		for(int i = 0; i < count; i++) {
			in[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(in);

		for(int i = 0; i < count; i++) {
			System.out.println(in[i]);
		}
	}
}
