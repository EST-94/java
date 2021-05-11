import java.util.ArrayList;
import java.util.Collections;

public class ExecClass {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student("홍길동", 100));
		student.add(new Student("둘리", 10));
		student.add(new Student("도우너", 30));
		student.add(new Student("또치", 50));
		student.add(new Student("강감찬", 80));
		student.add(new Student("이순신", 90));
		student.add(new Student("희동이", 10));
		student.add(new Student("하니", 30));
		student.add(new Student("나예리", 100));
		student.add(new Student("고길동", 40));
		student.add(new Student("홍두깨", 20));
		
		Collections.sort(student);
		
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).name + " : " + student.get(i).score + "\n");
		}
	}
}
