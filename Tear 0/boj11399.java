import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] P = new int[count];
		int result = 0;
		
		for(int i = 0; i < count; i++) {
			P[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(P);
		
		for(int i = 0; i < count; i++) {
			result += P[i] * (count - i);
		}
		
		System.out.println(result);
	}
}
