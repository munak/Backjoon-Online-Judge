import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		int week = 0;
		sc.close();
		
		for(int i = 1; i < month; i++) {
			if(i == 2) {
				week += 28;
			} else if((i < 8 && (i % 2 == 1)) || (i >= 8 && (i % 2 == 0))) {
				week += 31;
			} else {
				week += 30;
			}
		}
		
		week = (week + day) % 7;
		
		switch(week) {
			case 0 :
				System.out.println("SUN");
				break;
			case 1 :
				System.out.println("MON");
				break;
			case 2 :
				System.out.println("TUE");
				break;
			case 3 :
				System.out.println("WED");
				break;
			case 4 :
				System.out.println("THU");
				break;
			case 5 :
				System.out.println("FRI");
				break;
			case 6 :
				System.out.println("SAT");
				break;
		}
	}
}
