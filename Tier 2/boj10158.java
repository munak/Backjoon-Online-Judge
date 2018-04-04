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
		StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st1.nextToken()), h = Integer.parseInt(st1.nextToken()), x = Integer.parseInt(st2.nextToken()), y = Integer.parseInt(st2.nextToken()), count = Integer.parseInt(br.readLine());

		br.close();
		
		if((x + count) % w != 0 && ((x + count) / w) % 2 == 0) {
			bw.write(((x + count) % w) + " ");
		} else if((x + count) % w == 0 && ((x + count) / w) % 2 == 1) {
			bw.write(w + " ");
		} else if((x + count) % w == 0 && ((x + count) / w) % 2 == 0) {
			bw.write("0 ");
		} else {
			bw.write((w - (x + count) % w) + " ");
		}
		
		if((y + count) % h != 0 && ((y + count) / h) % 2 == 0) {
			bw.write(((y + count) % h) + "");
		} else if((y + count) % h == 0 && ((y + count) / h) % 2 == 1) {
			bw.write(h + "");
		} else if((y + count) % h == 0 && ((y + count) / h) % 2 == 0) {
			bw.write("0");
		} else {
			bw.write((h - (y + count) % h) + "");
		}
		
		bw.flush();
		bw.close();
	}	
}
