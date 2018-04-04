import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		int count = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < count; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		br.close();
		
		for(int i : set) {
			bw.write(i + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
