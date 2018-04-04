import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		double re = 0;
		Double max = Double.MIN_VALUE;
		Double[] in = new Double[count];
		
		for(int i = 0; i < count; i++) {
			Double next = sc.nextDouble();
			if(max < next) {
				max = next;
			}
			in[i] = next;
		}
		sc.close();
		
		for(int i = 0; i < count; i++) {
			in[i] = in[i] / max * 100;
			re += in[i];
		}
		
		System.out.printf("%.2f",re / count);
	}
	
}
