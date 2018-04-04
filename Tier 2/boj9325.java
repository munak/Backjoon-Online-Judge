import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine()), s, n;
		
		for(int i = 0; i < count; i++) {
			s = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			int q, p, option = 0;
			
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				q = Integer.parseInt(st.nextToken());
				p = Integer.parseInt(st.nextToken());
				
				option += q * p;
			}
			
			bw.write(s + option + "\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}
