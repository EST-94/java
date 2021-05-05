
public class insadevelop {
	String name;
	String position;
	String work;
	int fees;
	int performancerank;
	int totalfees;
	int labelnumbers = 0;
	double avgfees;


	public insadevelop(String name, String position, int fees, String work, int performancerank) {
		this.name = name;
		this.position = position;
		this.fees = fees;
		this.work = work;
		this.performancerank = performancerank;
		this.totalfees += fees;
		this.labelnumbers++;
		this.avgfees = Math.round((double) totalfees / labelnumbers);	}
}
