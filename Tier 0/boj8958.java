import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int result = 0;
			String s = sc.next();
			int[] arr = new int[s.length()];
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 79) {
					if(j != 0 && arr[j - 1] != 0) {
						arr[j] = arr[j - 1] + 1;
					} else {
						arr[j] = 1;
					}
					result += arr[j];
				}
			}
			System.out.println(result);
		}
		
		sc.close();
	}
}
