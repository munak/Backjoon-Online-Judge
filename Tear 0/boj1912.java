import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = arr[count - 1];
		
		for(int i = count - 2; i >= 0; i--) {
			arr[i] = (arr[i] > arr[i] + arr[i + 1]) ? arr[i]:arr[i] + arr[i + 1];
			max = (max > arr[i]) ? max:arr[i];
		}
		
		System.out.println(max);
	}
}
