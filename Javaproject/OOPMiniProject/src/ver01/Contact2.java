package ver01;

public class Contact2 {
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

	public Contact2(String name, String phoneNumber, String email, String address, String birthday, String group) {

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
