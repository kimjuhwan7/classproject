package chapter07.exam;

public class Female extends Person {

	String major;
	int grade;// 학년

	public Female(String name, String personNumber, String major, int grade) {
		super(name, personNumber);
		this.major = major;
		this.grade = grade;
	}

	void printSchoolInfo() {
		System.out.printf("전공은 %s, 이고 %d 학년입니다.", this.major, this.grade);
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println();
		printSchoolInfo();
	}

}
