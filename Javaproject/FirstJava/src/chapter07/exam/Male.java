package chapter07.exam;

public class Male extends Person {

	String niumckName;

	Male(String name, String pNum, String nimckName) {
		super(name, pNum);
		this.niumckName = nimckName;
	}

	void hi() {
		System.out.println("안녕하세요!");
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("별명은 " + niumckName + " 입니다.");
	}

}
