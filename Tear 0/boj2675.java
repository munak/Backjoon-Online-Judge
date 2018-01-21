import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			String result = new String();
			int count2 = sc.nextInt();
			String s = sc.next();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < count2; k++) {
					result += s.charAt(j);
				}
			}
			System.out.println(result);
		}
		
		sc.close();
	}
}
