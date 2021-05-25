import java.util.Scanner;

public class bj2579 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int levels = sc.nextInt();
	
	int stairs [] = new int [levels+1];
	int plus [] = new int [levels+1];
	
	// 시작값이 0, 입력받는 계단의 수를 맞춘 배열 형성
	
	for (int i = 1; i < stairs.length; i++) {
		stairs[i] = sc.nextInt();
	}
	
	// 
	
	plus[0] = 0;
	plus[1] = stairs[1];
	plus[2] = stairs[1] + stairs[2];
	
	for (int i = 3; i <= levels; i++) {
		plus[i] = Math.max(plus[i-2] + stairs[i], plus[i-3] + stairs[i-1] + stairs[i]);
	}
	
	for (int i = 0; i < plus.length; i++) {
		System.out.println(plus[i]);
	}
	
}

}

// https://st-lab.tistory.com/132