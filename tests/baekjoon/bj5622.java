package bjcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class bj5622 {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int counts = 0;
	
	String inputLines = bf.readLine().toLowerCase();
	byte [] bytes = inputLines.getBytes(StandardCharsets.US_ASCII);
	
	// a = 97, z = 122
	
	for (int i = 0; i < bytes.length; i++) {
		int dials = bytes[i] - 97;
		if (dials < 3) { // 2 - 3
			counts += 3;
		}
		if (dials > 2 && dials < 6) { // 3 - 3
			counts += 4;
		}
		if (dials > 5 && dials < 9) { // 4 - 3
			counts += 5;
		}
		if (dials > 8 && dials < 12) { // 5 - 3
			counts += 6;
		}
		if (dials > 11 && dials < 15) { // 6 - 3
			counts += 7;
		}
		if (dials > 14 && dials < 19) { // 7 - 4
			counts += 8;
		}
		if (dials > 18 && dials < 22) { // 8 - 3
			counts += 9;
		}
		if (dials > 21 && dials < 26) { // 9 - 4
			counts += 10;
		}
	}
	
		System.out.println(counts);
	}
}
