import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char inputs = bf.readLine().charAt(0);
		int nums = (int)inputs;
		
		System.out.println(nums);
	}
}
