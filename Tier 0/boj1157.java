import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int[] alphaet = new int[26];
		int max = Integer.MIN_VALUE;
		int value = 0;
		Boolean eq = false;
		
		sc.close();
		
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			alphaet[s.charAt(i) - 65]++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(alphaet[i] > max) {
				max = alphaet[i];
				eq = false;
				value = i + 65;
			} else if(alphaet[i] == max) {
				eq = true;
			}
		}
		
		if(eq) {
			System.out.println("?");
		} else {
			System.out.println((char)value);
		}
	}
}
