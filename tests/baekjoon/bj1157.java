import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class bj1157 {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	String letters = bf.readLine().toLowerCase();
	byte [] bytes = letters.getBytes(StandardCharsets.US_ASCII);
	int charArray [] = {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int testArray [] = {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	String alphaArray [] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "?"};
	
	int counter = 0;
	int maxCounter = 0;
	
	// a = 97, z = 122

	for (int i = 0; i < bytes.length; i++) {
		int target = bytes[i] - 97;
		charArray[target] ++;
		testArray[target] ++;
	}
	
	Arrays.sort(testArray);
	
	if (testArray[testArray.length - 1] == testArray[testArray.length - 2]) {
		counter = 26;
	}
	else {
		for (int c = 0; c < charArray.length; c++) {
			if (charArray[c] > maxCounter) {
				maxCounter = charArray[c];
				counter = c;
			}
		}
	}

	System.out.println(alphaArray[counter]);

	}
}
