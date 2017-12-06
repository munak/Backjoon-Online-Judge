import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String count = sc.nextLine();
		String num = sc.nextLine();
		sc.close();
		
		int re = 0;
		
		for(int i = 0; i < Integer.parseInt(count); i++) {
			re += (int) num.charAt(i) - 48;
		}
		
		System.out.println(re);
	}
}
