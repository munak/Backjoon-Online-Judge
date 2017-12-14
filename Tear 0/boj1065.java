import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		sc.close();
		
		if(Integer.toString(num).length() < 3) {
			System.out.println(num);
		} else {
			for(int i = 100; i <= num; i++) {
				count += trans(Integer.toString(i));
			}
			System.out.println(99 + count);
		}
	}
	
	static int trans(String s) {
		return (s.charAt(0) - s.charAt(1) == s.charAt(1) - s.charAt(2)) ? 1:0;
	}
}
