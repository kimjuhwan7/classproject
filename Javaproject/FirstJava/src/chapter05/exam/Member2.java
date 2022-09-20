package chapter05.exam;

public class Member2 {
	private String name;
	private String PhoneNumber;
	private String major;
	private int grade;
	private String email;
	private int birthday;
	private String address;

	public Member2(String name, String phoneNumber, String major, int grade, String email, int birthday,
			String address) {

		this.name = name;
		this.PhoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public Member2(String name, String phoneNumber, String major, int grade, String email) {
		this(name, phoneNumber, major, grade, email, 0, null);
//		this.name = name;
//		this.PhoneNumber = phoneNumber;
//		this.major = major;
//		this.grade = grade;
//		this.email = email;

	}

//메소드
	public void showMomberInfo() {
		System.out.println("회원 정보-----------");
		System.out.println("이름 : " + this.name);
		System.out.println("전화 : " + this.PhoneNumber);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.grade);
		System.out.println("이메일 : " + this.email);
		System.out.println("생일 : " + (this.birthday == 0 ? "미입력" : this.birthday));
		System.out.println("주소 : " + (this.address == null ? "미입력" : this.address));

	}
}
