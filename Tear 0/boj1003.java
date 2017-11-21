import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] re = new int[2];
		Arrays.fill(re, 0);

		for(int i = 0; i < count; i++) {
			fibonacci(sc.nextInt(), re);
			System.out.println(re[0] + " " + re[1]);
			Arrays.fill(re, 0);
		}
	}
	
	static void fibonacci(int n, int[] re) {
	    if (n == 0) {
	        re[0]++;
	    } else if (n == 1) {
	        re[1]++;
	    } else {
	        fibonacci(n - 1, re);
	        fibonacci(n - 2, re);
	    }
	}
}
