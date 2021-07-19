import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1152 {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	String origin [] = bf.readLine().split(" ");
	int counter = 0;
	
	for (int i = 0; i < origin.length; i++) {
		counter ++;
		
		if (origin[i] == "") {
			counter --;
		}
	}
	
	System.out.println(counter);
}
}
