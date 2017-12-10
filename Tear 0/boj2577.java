import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long sum = 1;
		int[] arr = new int[10];
		
		for(int i = 0; i < 3; i++) {
			sum *= sc.nextLong();
		}
		sc.close();
		
		for(int i = 0; i < Long.toString(sum).length(); i++) {
			arr[Long.toString(sum).charAt(i) - 48]++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
