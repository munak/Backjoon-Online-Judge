import java.util.Scanner;

public class Main {
	static int count;
	static int[][] Dp;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		int[][] colorPay = new int[count][3];
		Dp = new int[count][3];
		
		for(int i = 0; i < count; i++) {
			colorPay[i][0]  = sc.nextInt();
			colorPay[i][1]  = sc.nextInt();
			colorPay[i][2]  = sc.nextInt();
		}
		
		trans(colorPay, 0, count - 1);
		trans(colorPay, 1, count - 1);
		trans(colorPay, 2, count - 1);
		
		System.out.println(minValue(Dp[count - 1][0],minValue(Dp[count - 1][1],Dp[count - 1][2])));
		
		sc.close();
	}
	
	static int trans(int[][] rgbTotal, int rgb, int d) {
		if(d == 0) {
			return Dp[d][rgb] = rgbTotal[d][rgb];
		}
		
		if(Dp[d][rgb] != 0) {
			return Dp[d][rgb];
		}
		
		if(rgb == 0) {
			Dp[d][rgb] = minValue(trans(rgbTotal, 1, d - 1),trans(rgbTotal, 2, d - 1)) + rgbTotal[d][rgb];
		} else if(rgb == 1) {
			Dp[d][rgb] = minValue(trans(rgbTotal, 0, d - 1),trans(rgbTotal, 2, d - 1)) + rgbTotal[d][rgb];
		} else if(rgb == 2) {
			Dp[d][rgb] = minValue(trans(rgbTotal, 0, d - 1),trans(rgbTotal, 1, d - 1)) + rgbTotal[d][rgb];
		}
		
		return Dp[d][rgb];
	}
	
	static int minValue(int a, int b) {
		return (a < b) ? a:b;
	}
}
