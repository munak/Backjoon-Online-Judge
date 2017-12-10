import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] a = new int[count];
		int[] b = new int[count];
		int result = 0;
		
		for(int i = 0; i < count; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < count; i++) {
			b[i] = sc.nextInt() * (-1);
		}
		
		sc.close();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0; i < count; i++) {
			result += a[i] * b[i] * (-1);
		}
		
		System.out.println(result);
	}
}
