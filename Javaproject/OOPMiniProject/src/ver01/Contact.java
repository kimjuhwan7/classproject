package ver01;

public class Contact {

	private String name;// 이름
	private int phonenumber;// 전화번호
	private String email;// 이메일
	private String address;// 주소
	private int birthday;// 생일
	private String group;// 그룹

	public Contact(String name, int phonenumber, String email, String address, int birthday, String group) {
		this.name = name;
		this.phonenumber = phonenumber;
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

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void showContactInfo() {
		System.out.println("------------------------");
		System.out.println("   이름 : " + this.name);
		System.out.println("전화번호 : " + this.phonenumber);
		System.out.println("  이메일 : " + this.email);
		System.out.println("   주소 : " + this.address);
		System.out.println("   생일 : " + this.birthday);
		System.out.println("   그룹 : " + this.group);
		System.out.println("------------------------");

	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phonenumber=" + phonenumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}

}
//변수들은 private로 캡슐화
//변수에 getter setter 정의
//클래스 복사본을 만들고 데이터를 초기화하고 생성자정의
//저장데이터를 입력받아 인스턴스 생성

//main 정의
//연락쳐 저장하는 인스턴스 생성
//변수 값을 반환하여 데이터 출력
//인스턴스의 정보를 출력메소드 호출
//메소드 이용하여 인스턴스 데이터 주서ㅓㅇ
//수정된 인스턴스를 출력하는 메소드 실행