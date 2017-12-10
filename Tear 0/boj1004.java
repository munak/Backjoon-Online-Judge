import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] startPoint = new int[2];
		int[] endPoint = new int[2];
		
		int[] result = new int[count];
		
		for(int i = 0; i < count; i++) {
			startPoint[0] = sc.nextInt();
			startPoint[1] = sc.nextInt();
			
			endPoint[0] = sc.nextInt();
			endPoint[1] = sc.nextInt();
			
			int pCount = sc.nextInt();
			int[][] pPoint = new int[pCount][3];
			
			for(int j = 0; j < pCount; j++) {
				pPoint[j][0] = sc.nextInt();
				pPoint[j][1] = sc.nextInt();
				pPoint[j][2] = sc.nextInt();
			}
			
			result[i] = trans(startPoint, endPoint, pPoint, pCount);
		}
		sc.close();
		
		for(int i = 0; i < count; i++) {
			System.out.println(result[i]);
		}
	}
	
	static int trans(int[] sP, int[] eP, int[][] pP, int pL) {
		Boolean[][] checkP = new Boolean[2][pL];
		int resultCount = 0;
		
		for(int i = 0; i < pL; i++) {
			if(pP[i][2] > twoPointLength(sP[0], sP[1], pP[i][0], pP[i][1])) {
				checkP[0][i] = true;
			} else {
				checkP[0][i] = false;
			}
			
			if(pP[i][2] > twoPointLength(eP[0], eP[1], pP[i][0], pP[i][1])) {
				checkP[1][i] = true;
			} else {
				checkP[1][i] = false;
			}
			
			if(checkP[0][i] != checkP[1][i]) {
				resultCount++;
			}
		}
		
		return resultCount;
	}
	
	static double twoPointLength(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
	}
}
