import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int count;
	static List<String> resultNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		sc.close();
		
		int[] num = new int[count];
		resultNum = new ArrayList<String>();
		
		for(int i = 0; i < count; i++) {
			num[i] = i + 1;
		}
		
 		dfs(num,0);
		
 		Collections.sort(resultNum);
 		
 		for(String view : resultNum) {
 			System.out.println(view);
 		}
	}
	
	static void dfs(int[] arr, int start) {
		if(start == count) {
			storing(arr);
			return ;
		}
		
		for(int i = start; i < count; i++) {
			trans(arr,start,i);
			dfs(arr,start + 1);
			trans(arr,start,i);
		}
	}
	
	static void trans(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	
	static void storing(int[] arr) {
		String reNum = "";
		for(int i = 0; i < count; i++) {
			reNum += arr[i] + " ";
		}
		resultNum.add(reNum);
	}
	
}
