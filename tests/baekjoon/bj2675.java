package bjcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2675 {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	int T = Integer.parseInt(bf.readLine());
	int cnt = 0;
	
	while (cnt < T) {
		String results = "";
		String[] inputs = bf.readLine().split(" ");
		int times = Integer.parseInt(inputs[0]);
		String[] lines = inputs[1].split("");
		
		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < times; j++) {
				results += lines[i];
			}
		}
		
		System.out.println(results);
		cnt ++;
	}
	}
}
