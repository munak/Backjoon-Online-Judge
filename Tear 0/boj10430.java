import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		System.out.println((in[0] + in[1]) % in[2]);
		System.out.println((in[0] % in[2] + in[1] % in[2]) % in[2]);
		System.out.println((in[0] * in[1]) % in[2]);
		System.out.println((in[0] % in[2] * in[1] % in[2]) % in[2]);
	}
}
