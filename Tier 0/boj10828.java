import java.util.Scanner;

public class Main {
	static int[] stack;
	static int top = -1;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine());
		stack = new int[count];
		
		for(int i = 0; i < count; i++) {
			String commandTotal = sc.nextLine();
			if(commandTotal.equals("top")) {
				System.out.println((top == -1) ? -1:stack[top]);
			} else if(commandTotal.equals("size")) {
				System.out.println(top + 1);
			} else if(commandTotal.equals("empty")) {
				System.out.println((top == -1) ? 1:0);
			} else if(commandTotal.equals("pop")) {
				System.out.println((top == -1) ? -1:stack[top--]);
			} else {
				stack[++top] = Integer.parseInt(commandTotal.replace("push ",""));
			}
		}
		sc.close();
	}
}
