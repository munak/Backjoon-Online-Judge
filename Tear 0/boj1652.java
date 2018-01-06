import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String[] yString = new String[count];
		Arrays.fill(yString, "");
		int resultx = 0;
		int resulty = 0;
		
		for(int i = 0; i < count; i++) {
			String x = sc.next();
			for(int j = 0; j < x.length(); j++) {
				yString[j] += x.charAt(j) + "";
			}
			
			String[] arrx = x.split("X");
			for(String xx : arrx) {
				if(xx.length() >= 2) {
					resultx++;
				}
			}
		}
		
		sc.close();
		
		for(int i = 0; i < count; i++) {
			String y = yString[i];
			
			String[] arry = y.split("X");
			for(String yy : arry) {
				if(yy.length() >= 2) {
					resulty++;
				}
			}
		}
		
		System.out.println(resultx + " " + resulty);
	}
}
