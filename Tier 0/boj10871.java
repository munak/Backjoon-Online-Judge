import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		String re = "";
		
		for(int i = 0; i < n; i++) {
			int in = sc.nextInt();
			if(in < s) {
				re += in + " ";
			}
		}
		
		System.out.println(re);
	}
}
