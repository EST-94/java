import java.util.Scanner;

public class bj2293 {
	static int coins[];
	static int dp[];

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int coinNums = sc.nextInt();
	int targetNum = sc.nextInt();
	
	coins = new int [coinNums];
	dp = new int [targetNum + 1];
	// 해당 칸은 길이를 결정한다. 배열은 0부터 시작하므로 목표값과 일치시키려면 + 1.
	
	dp[0] = 1;
	// dp 배열은 경우의 수(가지 수)를 구하기 위한 배열이다.
	// 동전이 목표한 값을 구하지 못한다면 초기값과 무관하게 dp[target]은 0을 리턴한다.
	// 따라서 초기값은 1가지 경우의 수를 갖는 배열에 해당한다.
	
	for (int i = 0; i < coins.length; i++) {
		coins[i] = sc.nextInt();
	}
	
	sc.close();
	System.out.println(ways(targetNum));
}

static int ways(int i) {
	// 각 동전이 갖는 경우의 수를 누적시켜 구하는 방법.
	// 가령 동전이 1, 2, 5원이고, 목표가 10원일 때 -
	// 1원을 통해 10원을 만드는 경우의 수 += 2원을 통해... += 5원을 통해..
	
	for (int j = 0; j < coins.length; j++) {
		// 주어진 동전값이 저장된 배열의 모든 원소를 꺼내와야 하므로 이에 상응하는 반복문 형성
		System.out.println("------------------------------");
		System.out.println("코인값 : " + coins[j]);
		for (int k = coins[j]; k <= i; k++) {
			// 동전의 첫 번째 값부터 목표까지 1씩 증가하며 모든 경우의 수 누적
			dp[k] += dp[k - coins[j]];
			System.out.println(k + " : k값");
			System.out.println(dp[k] + " : dp값\n");
		}
	}
	return dp[i];
	
}
}
