package bj;

import java.util.Scanner;

public class quest4344 {
	
	// 테스트케이스 C, 학생의 수 N, N명의 점수가 주어진다.
	// 점수는 0 ~ 100의 정수이다.
	// 각 케이스마다 한 줄씩 평균을 넘는 비율을 소수점 셋째까지 반올림하여 출력한다.
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int C = sc.nextInt();
	int[][] scores = new int [C][];
	int [] avg = new int [C];
	int [] over = new int [C];
	double results;
	
	for (int i = 0; i < scores.length; i++) {
		int N = sc.nextInt();
		scores[i] = new int [N];
		for (int j = 0; j < scores[i].length; j++) {
			scores[i][j] = sc.nextInt();
			avg[i] += scores[i][j];
		}
		avg[i] = avg[i] / N;
	}
	
	for (int i = 0; i < over.length; i++) {
		for (int j = 0; j < scores[i].length; j++) {
			if (scores[i][j] > avg[i]) {
				over[i]++;
			}
		}
	}
	
	for (int i = 0; i < over.length; i++) {
		results = (double)(over[i]*100) / scores[i].length;
		System.out.println(String.format("%.3f", results) + "%");
	}
		
}
}
