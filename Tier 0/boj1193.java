import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] arrx = new int[count];
		int[] arry = new int[count];
		
		sc.close();
		
		int top = -1;
		
		for(int i = 0; i < count && top < count - 1; i++) {
			for(int j = 0; j < i + 1 && top < count - 1; j++) {
				if(i % 2 == 0) {
					arry[++top] = j + 1;
					arrx[top] = i - j + 1;
				} else {
					arry[++top] = i - j + 1;
					arrx[top] = j + 1;
				}
			}
		}
		
		System.out.println(arrx[count - 1] + "/" + arry[count - 1]);
	}
}
