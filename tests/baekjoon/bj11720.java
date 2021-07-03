import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11720 {
public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(bf.readLine());
		String N [] = bf.readLine().split("");
		int results = 0;
		
		for (int i = 0; i < N.length; i++) {
			results += Integer.parseInt(N[i]);
		}
		System.out.println(results);
	}
}
