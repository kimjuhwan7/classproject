package ver06;

import java.util.Iterator;

//1. 메뉴 입력 시 발생할 수 있는 예외에 대하여 예외 처리합시다.
//
//2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다.
//
//3. 전화번호 형식에 맞지 않을 때 예외처리를 하고 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다.
abstract class Contact implements ShowData {
//	저장 정보
//		이름
//		전화번호
//		이메일
//		주소
//		생일
//		그룹
//	변수들은 직접 참조릴 막아 캡슐화 처리를 하도록 해봅시다.
	private String name;// 친구의 이름
	private String phoneNumber;// 전화번호
	private String email;
	private String address;
	private String birthday;
	private String group;

	public Contact() {

	}

	public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
	// 2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다.

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
//		3. 전화번호 형식에 맞지 않을 때 예외처리를 하고 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다. (받았던 곳으로 돌려주기)

		this.phoneNumber = phoneNumber.trim();

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// 위 데이터를 출력하는 기능
	public void printInfo() {
		System.out.println("친구정보============");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : " + this.group);

	}

	@Override
	public String toString() {
		return "Contact2 [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}

}
