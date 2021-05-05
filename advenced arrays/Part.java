import java.util.ArrayList;

public class Part { // 각 파트의 배열을 구성하는 클래스
	String name;
	ArrayList<People> member;
	
	Part(String name) {
		this.name = name;
		member = new ArrayList<People>();
	}
}
