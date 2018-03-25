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
		
		int max = -1, current = 0;

		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			current = current - (Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
			
			max = (max > current) ? max : current;
		}
		
		br.close();
		
		bw.write(max + "\n");
		bw.flush();
		bw.close();
	}
}
