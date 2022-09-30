package ver03;

public class CompanyContact extends Contact {
//	① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//	- 회사이름, 부서이름, 직급 변수 추가
//	- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
	private String company;// 회사이름
	private String division;// 부서이름
	private String manager;// 거래처

	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String division, String manager) {
//constructor 해줌
		super(name, phoneNumber, email, address, birthday, group);

		this.company = company;
		this.division = division;
		this.manager = manager;
	}

	@Override
	public void printInfo() {
		super.printInfo();// 상위타입 프린트인포 메소드 사용
		System.out.println("회사이름 : " + this.company);// company 변수 추가 출력
		System.out.println("부서이름 : " + this.division);
		System.out.println("직급: " + this.manager);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public static void main(String[] args) {// CompanyContact 메소드 입력
		Contact contatc = new CompanyContact("Son", "010-2323-5656", "son@gmail.com", "london", "2000-10-12", "직장동료",
				"토트넘", "선수", "없음");
		contatc.printInfo();//CompanyContact 클래스 printInfo로 출력

	}
}
