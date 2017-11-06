import java.util.Scanner;

public class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		
        int result = 1;

        result = result * sc.nextInt() * sc.nextInt();

        sc.close();
        
        System.out.println(result);
	}
}
