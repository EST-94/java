package kakaoTest0508;

import java.util.ArrayList;
import java.util.Scanner;

// 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
// 1478 → "one4seveneight"
// 234567 → "23four5six7"
// 10203 → "1zerotwozero3"
// 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. 
// s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

// 1 ≤ s의 길이 ≤ 50
// s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
// return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.

public class kt01_210508 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String [] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	String [] intNums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	ArrayList <Integer> filtered = new ArrayList <Integer>();
	String temp = "";
	String answer = "";
	
	String s = sc.nextLine();
	String [] finder = s.split("");
		
		for (int i = 0; i < finder.length; i++) {
			temp += finder[i];
			for (int j = 0; j < numbers.length; j++) {
				if (temp.equals(numbers[j])) {
					filtered.add(j);
					temp = "";
				}
				if (temp.equals(intNums[j])) {
					filtered.add(j);
					temp = "";
				}
			}
		}
		for (int i = 0; i < filtered.size(); i++) {
			answer += filtered.get(i);
		}
		System.out.println(answer);
	}
}