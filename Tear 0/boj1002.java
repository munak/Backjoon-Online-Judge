import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		long[][] XYR1s = new long[count][3];
		long[][] XYR2s = new long[count][3];
		int result[] = new int[count];

		for(int i = 0; i < count; i++) {
			for(int j = 0; j < 6; j++) {
				if(j < 3) {
					XYR1s[i][j] = sc.nextInt();
				} else {
					XYR2s[i][j % 3] = sc.nextInt();
				}
			}
		}
		sc.close();
		
		for(int i = 0; i < count; i++) {
			double len = getDistance(XYR1s[i][0], XYR1s[i][1], XYR2s[i][0], XYR2s[i][1]);
			if(len == 0 && XYR1s[i][2] == XYR2s[i][2]) {
				result[i] = -1;
			} else if((len > XYR1s[i][2] + XYR2s[i][2]) || (len < Math.abs(XYR1s[i][2] - XYR2s[i][2]))) {
				result[i] = 0;
			} else if((len == XYR1s[i][2] + XYR2s[i][2]) || (len == Math.abs(XYR1s[i][2] - XYR2s[i][2]))) {
				result[i] = 1;
			} else if((len < XYR1s[i][2] + XYR2s[i][2]) && (len > Math.abs(XYR1s[i][2] - XYR2s[i][2]))) {
				result[i] = 2;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(result[i]);
		}
	}
	
	static double getDistance(long X1, long Y1, long X2, long Y2) {
		return Math.sqrt(Math.pow(X1 - X2, 2.0) + Math.pow(Y1 - Y2, 2.0));
	}
}
