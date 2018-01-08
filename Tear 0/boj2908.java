import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String[] result = {"", ""};
		
		for(int i = 0; i < 2; i++) {
			String num = sc.next();
			for(int j = 2; j >= 0; j--) {
				result[i] += num.charAt(j);
			}
		}
		
		sc.close();
		
		System.out.println((Integer.parseInt(result[0]) > Integer.parseInt(result[1])) ? result[0]:result[1]); 
	}
}
