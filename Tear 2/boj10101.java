import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
		
		br.close();
		
		if(a == b && b == c && c == 60) {
			bw.write("Equilateral");
		} else if(a + b + c == 180 && (a == b || b == c || c == a)) {
			bw.write("Isosceles");
		} else if(a + b + c == 180 && a != b && b != c && c != a) {
			bw.write("Scalene");
		} else {
			bw.write("Error");
		}
		
		bw.flush();
		bw.close();
	}	
}
