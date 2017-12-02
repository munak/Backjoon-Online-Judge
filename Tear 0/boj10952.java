import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[]{sc.nextInt(), sc.nextInt()};
		
		while((in[0] != 0) && (in[1] != 0)) {
			System.out.println(in[0] + in[1]);
	
			in = new int[]{sc.nextInt(), sc.nextInt()};
		}
		sc.close();
	}
}
