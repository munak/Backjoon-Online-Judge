import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine()), result = 0;
		int[] arr;
		Boolean pass;
		
		for(int i = 0; i < count; i++) {
			arr = new int[26];
			pass = true;
			
			String s = br.readLine();
			
			for(int j = 1; j < s.length(); j++) {
				if(s.charAt(j) == s.charAt(j - 1)) {
					continue;
				} else if(arr[s.charAt(j) - 97] == 0) {
					arr[s.charAt(j - 1) - 97] = 1;
				} else {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				result++;
			}
		}
		
		br.close();
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}
