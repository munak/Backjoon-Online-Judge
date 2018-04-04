import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		int re = 0;
		String[] arr;
		
		sc.close();
		
		arr = in.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].isEmpty()) {
				re++;
			}
		}
		
		System.out.println(re);
	}
}
