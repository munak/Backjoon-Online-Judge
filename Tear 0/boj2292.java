import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		int standard = 1, result = 1, i = 0;
		sc.close();
		
		while(true) {
			standard += 6 * i;
			if(in <= standard) {
				System.out.println(result);
				break;
			}
			
			result++;
			i++;
		}
	}
}
