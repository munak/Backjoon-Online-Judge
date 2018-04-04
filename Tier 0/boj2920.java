import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		Boolean flag = true;
		
		for(int i = 1; i < 8; i++) {
			if(flag == false) {
				sc.nextLine();
				break;
			} else if(start == 1 && flag == true && sc.nextInt() - i != start) {
				flag = false;
			} else if(start == 8 && flag == true && sc.nextInt() + i != start) {
				flag = false;
			}
		}
		
		sc.close();
		
		if(flag == false) {
			System.out.println("mixed");
		} else {
			if(start == 1) {
				System.out.println("ascending");
			} else {
				System.out.println("descending");
			}
		}
	}
}
