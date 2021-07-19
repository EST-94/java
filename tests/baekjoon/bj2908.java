import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2908 {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	String inputs [] = (bf.readLine().replace(" ", "")).split("");
	String ex1 = "";
	String ex2 = "";
	
	for (int i = 2; i >= 0; i--) {
		ex1 += inputs[i];
		ex2 += inputs[i + 3];
	}
	
	if (Integer.parseInt(ex1) > Integer.parseInt(ex2)) {
		System.out.println(ex1);
	}
	else {
		System.out.println(ex2);
	}
}
}
