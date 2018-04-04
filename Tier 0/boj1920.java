import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] A = new int[count];
		
		for(int i = 0; i < count; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int searchCount = sc.nextInt();
		
		for(int i = 0; i < searchCount; i++) {
			System.out.println(searchN(sc.nextInt(), A, 0, count - 1));
		}
		sc.close();
	}
	
	static int searchN(int find, int[] arr, int f, int l) {
		int center = (f + l) / 2;
		
		if(f == l) {
			if(find == arr[f]) {
				return 1;
			} else {
				return 0;
			}
		} else if(f == l - 1) {
			if(find == arr[f] || find == arr[l]) {
				return 1;
			} else {
				return 0;
			}
		}
		
		if(find == arr[center]) {
			return 1;
		} else if(find < arr[center]) {
			return searchN(find, arr, f, center - 1);
		} else if(find > arr[center]) {
			return searchN(find, arr, center + 1, l);
		} else {
			return -1;
		}
	}
}
