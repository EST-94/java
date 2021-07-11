package bjcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class bj10809 {
public static void main(String[] args) throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	String letters = bf.readLine().toLowerCase();
	byte [] bytes = letters.getBytes(StandardCharsets.US_ASCII);
	int charArray [] = {-1, -1, -1 ,-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	
	// a = 97, z = 122

	for (int i = 0; i < bytes.length; i++) {
		int target = bytes[i] - 97;
		if(charArray[target] == -1) {
			charArray[target] = i;
		}
	}
	
	for (int i = 0; i < charArray.length; i++) {
		System.out.print(charArray[i] + " ");
		if(i - 1 == charArray.length) {
			System.out.println(charArray[i]);
		}
	}
	}
}
