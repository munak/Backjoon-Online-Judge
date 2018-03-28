import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = 1000 - Integer.parseInt(br.readLine()), sum = 0;
		
		br.close();
		
		for(int i = 100; i > 0; i /= 10) {
			sum += m / (5 * i);
			m -= (m / (5 * i)) * (5 * i);
			
			sum += m / i;
			m -= (m / i) * i;
		}
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}	
}
