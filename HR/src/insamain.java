import java.util.ArrayList;
import java.util.Scanner;

public class insamain {
public static void main(String[] args) {
	boolean process = false;
	Scanner sc = new Scanner(System.in);
	ArrayList <insadevelop> develop = new ArrayList <insadevelop>();
	ArrayList <insasales> humanresource = new ArrayList <insasales>();
	ArrayList <insahr> salesteam = new ArrayList <insahr>();
	
	String menuselect;
	String name;
	String work;
	String position;
	String tempString;
	int fees;
	int performancerank;

	while (process = true) {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 인사관리 \n2. 통계출력 \n3. 프로그램 종료");
		menuselect = sc.nextLine();
		
		if (menuselect.equals("1")) {// 인사관리
			System.out.println("관리부서를 선택하세요.");
			System.out.println("1. 개발부 \n2. 인사부 \n3. 영업부 \n4. 이전단계");
			menuselect = sc.nextLine();
			if (menuselect.equals("1")) { // 개발부
				System.out.println("1. 인원추가 \n2. 정보수정 \n3. 고과평가 \n4. 이전단계");
				menuselect = sc.nextLine();
				if (menuselect.equals("1")) { // 인원추가
					System.out.println("추가하려는 인원의 인적사항을 입력합니다.");
					System.out.print("이름 : ");
					name = sc.nextLine();
					System.out.print("직위 : ");
					position = sc.nextLine();
					System.out.print("담당업무 : ");
					work = sc.nextLine();
					System.out.print("급여 (만원) : ");
					tempString = sc.nextLine();
					fees = Integer.parseInt(tempString);
					performancerank = 0;
					
					develop.add(new insadevelop(name, position, fees, work, performancerank));
					

				}
				if (menuselect.equals("2")) { // 정보수정
					
				}
				if (menuselect.equals("3")) { // 고과평가
					
				}
				if (menuselect.equals("4")) {
					System.out.println("이전단계로 돌아갑니다.");
					continue;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.\n");
					continue;
				}
			}
			if (menuselect.equals("2")) { // 인사부
				
			}
			if (menuselect.equals("3")) { // 영업부
				
			}
			if (menuselect.equals("4")) {
				System.out.println("이전단계로 돌아갑니다.");
				continue;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.\n");
				continue;
			}
		}
		if (menuselect.equals("2")) {
			System.out.println("출력하실 통계를 선택하세요.");
			System.out.println("1. 개발부 \n2. 인사부 \n3. 영업부 \n4. 이전단계");
			menuselect = sc.nextLine();
		}
		if (menuselect.equals("3")) {
			System.out.println("입력을 종료합니다.");
			process = false;
		}
		else {
			System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.\n");
		}
	}
	
}
}
