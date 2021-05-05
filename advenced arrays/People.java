
public class People { // 기본 클래스
	String name;
	String position;
	String work;
	
	@Override
	public String toString() {
		return this.name + " : " + this.position + ", " + this.work;
	}
}
