import java.util.Scanner;

public class Main {
	static int total;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			check(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(total);
	}
	
	static void check(int num) {
		int i = 0;
		for(i = 2; num % i != 0 && i < num; i++);
		
		if(i == num) {
			total++;
		}
	}
}
