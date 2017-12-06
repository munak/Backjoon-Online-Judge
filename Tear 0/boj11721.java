import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		String[] arr = new String[in.length() / 10 + 1];
		sc.close();

		int i;
		for(i = 0; i < in.length() / 10; i++) {
			arr[i] = in.substring(i * 10, (i + 1) * 10);
		}
		arr[i] = in.substring(i * 10, i * 10 + in.length() % 10);
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}
}
