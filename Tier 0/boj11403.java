import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int dot = sc.nextInt();
		int[][] matrix = new int[dot][dot];
		
		for(int i = 0; i < dot; i++) {
			for(int j = 0; j < dot; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for(int k = 0; k < dot; k++) {
            for(int i = 0; i < dot; i++) {
                for(int j = 0; j < dot; j++) {
                    if(matrix[i][k] == 1 && matrix[k][j] == 1) {
                    	matrix[i][j] = 1;
                    }
                }
            }
        }
		
		for(int i = 0; i < dot; i++) {
			for(int j = 0; j < dot; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
