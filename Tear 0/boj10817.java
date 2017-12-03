import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] re = new int[]{Integer.MIN_VALUE,0,Integer.MAX_VALUE};

		for(int i = 0; i < 3; i++) {
			int in = sc.nextInt();
			int st = 0;
			if(re[0] < in) {
				re[1] = re[0];
				re[0] = in;
			} else {
				st++;
			}
			
			if(re[2] > in) {
				re[1] = re[2];
				re[2] = in;
			} else {
				st++;
			}
			
			if(st == 2) {
				re[1] = in;
			}
		}
		sc.close();
		
		System.out.println(re[1]);	
	}
}
