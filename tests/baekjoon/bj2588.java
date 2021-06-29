import java.util.Scanner;

public class bj2588 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = Integer.parseInt(sc.nextLine());
	String[] num2 = sc.nextLine().split("");
	int results[] = new int [num2.length+1];
	
	sc.close();
	
	for (int i = 1; i <= num2.length; i++) {
		results[num2.length-i] = num1 * Integer.parseInt(num2[num2.length-i]);
		results[results.length-1] += results[num2.length-i] * Math.pow(10,i-1);
	}
		
	for (int i = 0; i < results.length; i++) {
		System.out.println(results[i]);
	}
	
}
}
