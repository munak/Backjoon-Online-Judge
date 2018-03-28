import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int min = Integer.parseInt(br.readLine()), max = Integer.parseInt(br.readLine()), sum = 0, first = -1;
		
		br.close();
		
		int[] arr = new int[max + 1];
		arr[1] = 1;
		
		for(int i = 2; i <= max; i++) {
			for(int j = (min % i == 0) ? (min / i) : (min / i) + 1; i * j <= max; j++) {
				if(j != 1) {
					arr[i * j] = 1;
				}
			}
		}
		
		for(int i = min; i <= max; i++) {
			if(arr[i] == 0) {
				sum += i;
				if(first == -1) {
					first = i;
				}
			}
		}
		
		if(sum == 0) {
			bw.write(first + "\n");
		} else {
			bw.write(sum + "\n" + first);
		}
		bw.flush();
		bw.close();
	}
}
