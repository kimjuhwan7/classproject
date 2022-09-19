package chapter05.exam;

//아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
//② 위에서 정의한 정보를 출력하는 메소드 정의
//③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
//④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

public class Member {
	String name;// 이름
	long phone_number;// 전화번호
	String department;// 전공
	int grade;// 학년
	String email;// 이메일
	String birthday;// 생일
	String address;// 주소

	Member(String name, long phon_number, String department, int grade, String email, String birthday, String address) {
		this.name = name;
		this.phone_number = phon_number;
		this.department = department;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	Member(String name, long phon_number, String department, int grade, String email) {
		this(name, phon_number, department, grade, email, "미입력", "미입력");
	}

	void member_Print() {
		System.out.println("   이름: " + name);
		System.out.println("전화번호: " + phone_number);
		System.out.println("   전공: " + department);
		System.out.println("   학년: " + grade);
		System.out.println("  이메일: " + email);
		System.out.println("   생일: " + birthday);
		System.out.println("   주소: " + address);
	}
}
