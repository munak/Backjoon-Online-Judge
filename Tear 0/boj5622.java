import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - 65;
			
			if(n <= 14) {
				sum += n / 3 + 3;
			} else if(n <= 18) {
				sum += 8;
			} else if(n <= 21) {
				sum += 9;
			} else {
				sum += 10;
			}
		}
		
		br.close();
		
		bw.write(sum +"\n");
		bw.flush();
		bw.close();
	}
}
