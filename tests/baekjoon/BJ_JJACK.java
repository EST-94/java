import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class BJ_JJACK {
	public static void main(String[] args) throws FileNotFoundException, EmptyStackException {
		System.setIn(new FileInputStream("src/sample_input.txt"));

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < N; i++) {
			Stack<String> stack = new Stack<>();

			String arr[] = sc.nextLine().split("");

//			System.out.println(Arrays.toString(arr));

			int L = Integer.parseInt(arr[0]);

			// 인덱스를 올바르게 뽑기 위한 arrayCopy.
			String[] arr2 = new String[arr.length - 2]; // 처음 숫자랑 빈칸 제외하고 arraycopy
			System.arraycopy(arr, 2, arr2, 0, arr2.length);
			
			
			// 애초에 서로 짝이 맞지 않는 경우 - 0출력
			
			int leftCnt = 0;
			int rightCnt = 0;
			for(int j = 0; j < arr2.length; j++) {
				if(arr2[j].equals("(")) {
					leftCnt++;
				} else if(arr2[j].equals(")")) {
					rightCnt++;
				}
			}
			
			if(leftCnt != rightCnt) {
				System.out.println(0);
				continue;
			}

//			System.out.println(Arrays.toString(arr2));
			// 세번째 괄호에서부터 시작 -> 인덱스[2] 부터 시작이니 L-1부터 반복문.
			for (int j = L-1; j < arr2.length; j++) {
				// ")" 가 들어오면 push하지 않고 짝이 맞았다고 생각, 원래 있던 맨 위의 "(" 를 pop 한다.
				if (arr2[j].equals(")")) { 
					stack.pop(); 
					if(stack.empty() == true) { // 짝이 모두 맞아서 stack이 비었을 때 stop. 
						System.out.println(j+1); // 괄호의 위치값 = 인덱스+1 
						break;
					}
					

				} else {
					stack.push(arr2[j]);
				}

			}
//			System.out.println(stack.peek());
//			System.out.println(stack.size());
		}

	}

}
