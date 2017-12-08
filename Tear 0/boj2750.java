import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] num = new int[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		for(int i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
			
		sc.close();
	}
}
