import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[]{sc.nextInt(), sc.nextInt()};
		
		sc.close();
		
		int G = (arr[0] > arr[1]) ? gcd(arr[0],arr[1]):gcd(arr[1],arr[0]);
		
		System.out.println(G);
		System.out.println(arr[0] * arr[1] / G);
	}
	
	static int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
