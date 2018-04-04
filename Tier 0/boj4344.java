import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int student = sc.nextInt(), sum = 0, pass = 0;
			int[] score = new int[student];
			for(int j = 0; j < student; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			double mid = sum / student;
			for(int j = 0; j < student; j++) {
				pass = (score[j] > mid) ? pass + 1:pass;
			}
			System.out.printf("%.3f%%\n",(double)pass / student * 100);
		}
		
		sc.close();
	}
}
