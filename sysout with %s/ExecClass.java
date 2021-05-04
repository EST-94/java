import com.kopo.Test;

public class ExecClass {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
//		java.util.Date d1 = new java.util.Date();
//		java.sql.Date d2 = new java.sql.Date();
		
		com.kopo.Test t1 = new Test();
		
		
		int a = 10;
		double b = 20;
		Integer c = 20;
		Double d = 10.0;
		Double d1 = new Double(20.0);
		
		// 4자리 숫자 표시
		for (int i = 0; i < 101; i++) {
//			System.out.println(i);
//			String tmpString = String.format("%4d", i);
			String tmpString = String.format("%04d", i);
			System.out.println(tmpString);
		}
	}
}
