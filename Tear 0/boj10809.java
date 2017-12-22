import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int[] alphabat = new int[26];
		Arrays.fill(alphabat, -1);
		
		sc.close();
		
		for(int i = 0; i < s.length(); i++) {
			if(alphabat[s.charAt(i) - 97] == -1) {
				alphabat[s.charAt(i) - 97] = i;
			}
		}
		
		for(int printing : alphabat) {
			System.out.print(printing + " ");
		}
	}
}
