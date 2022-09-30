package ver03;

import java.util.Iterator;
import java.util.Scanner;

public class SmartPhone {

	// 기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
	// 여러개의 인스턴스가 생성될 피료가 없다! = >싱글톤 패션 사용가능하다
	// 1. private 생성자
	// 2. 클래스 내부에서 인스턴스를 생성 static private
	// 3. 내부에서 생성항 참조값을 반환 해주는 메소드 필요하다 static public

	// 요구사항
	// 이 클래스는 연락처 정보를 관리하는 클래스입니다.
	// ① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	// => 10개 정보를 저장할 수 있다. -> 배열 인스턴스를 생성 Contact[]
	// Contact 클래스 기반의 인스턴스를 최대 10개까지 만들어서 배열에 참조값을 저장
	private Contact[] contacts; // 비공개 Contact[ ] 배열을 만들었다.
	private int numOfContact;// 비공개 배열 index로 사용할 정수타입 변수 만들었음
	Scanner sc;// sc를 싱글톤으로 다른 클래스에서 사용하기 위해 이름만 지정해줌

	private SmartPhone(int size) { // 클래스 이름과 같은 매개변수 하나짜리 비공개로 만들었음(외부참조 못함)
		contacts = new Contact[size];// Contact[ ] 배열 안에 size값 공간에다가 contacts 이름으로 주소를 저장함
		numOfContact = 0;// Main에서 사용할 예정이기에 여기서 변수값 설정
		sc = new Scanner(System.in);// 싱글톤에서 사용하려고 여기 만들었음
	}

	private static SmartPhone sp = new SmartPhone(10); // 비공개로 선실행하여 이름을 sp로 짓고 SmartPhone에 10인자 값 전달

	public static SmartPhone getInstance() {// getInstance로 sp에 SmartPhone(10)을 넣고 만들어 메모리에 올림
		if (sp == null) {// 외부에서 참조하지 못하게 private로 막고 내부에서 메모리 올린후 주소값을 sp에 넣어서 공개함
			sp = new SmartPhone(10);// 혹시 모를 상황에 대비하여 if문으로 sp변수에 주소값이 없을때 주소 값을 넣어줌
		}
		return sp;// 외부에서 SmartPhone.getInstance()를 실행하면 return값에 담긴 이 클래스 주소를 반환해준다
	}// 너무 어렵습니다.ㅜ

	// 기능
	// 배열에 인스턴스를 저장하고,
	// 수정하고,
	// 삭제,
	// 검색 후 결과 출력,
	// 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

	// 이름 검색후 데이터 수정
	void deitContact() {
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.print("수정하고자 하는 이름을 입력해주세요 >");
		String name = sc.nextLine();// SmartPhone에서 지정한 sc에 넣어서 사용이 가능하다

		// 수정하고자 하는 index 찾아야 한다! -> 시프트
		int serchIndex = -1;// 현재 검색의 결과는 없다.
		// serchIndex가 0으로 되어있으면 0번 배열이 나오니깐 -1부터 시작한다

		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {// index에 총 길이만큼 실행
			if (contacts[i].getName().equals(name)) {// 사용자가 입력한 name과 기존 getName()값을 비교
				serchIndex = i;// 비교한 값이 일치하면 true가 나옴으로 true가 나온 배열순번을 index에 넣어준다.
				break;// 값이 같으면 실행후 반복문 나오기
			}
		}
		if (serchIndex < 0) {// 위 for문에서 찾지 못했을 경우 serchIndex값은 -1로 그대로이기 때문에 true나옴
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}
		Contact contact = contacts[serchIndex];// 위 for문 반복후 contacts[i] 번째 배열을 contact에 넣음
		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자하는 이름을 입력해 주세요.(현재값:" + contact.getName() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");
		// contacts[i]번째 에서.getName()을 하여 값 가져와서 출력
		String newName = sc.nextLine();// 입력값 newName에 넣어줌
		if (newName != null && newName.trim().length() > 0) {// 방금 입력한 newName이 비어있지않고 글자가 1글자 이상이라면
			contact.setName(newName);// 구한 contact[i]에 있는 setName으로 입력값 수정
		}
		System.out.println("변경하고자하는 전화번호를 입력해 주세요.(현재값:" + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");
		String newPhoneNumber = sc.nextLine();
		if (newPhoneNumber != null && newPhoneNumber.trim().length() > 0) {
			contact.setPhoneNumber(newPhoneNumber);
		}
		System.out.println("변경하고자하는 이메일을 입력해 주세요.(현재값:" + contact.getEmail() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");
		String newEmail = sc.nextLine();
		if (newEmail != null && newEmail.trim().length() > 0) {
			contact.setEmail(newEmail);
		}
		System.out.println("변경하고자하는 주소를 입력해 주세요.(현재값:" + contact.getAddress() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");
		String newAddress = sc.nextLine();
		if (newAddress != null && newAddress.trim().length() > 0) {
			contact.setAddress(newAddress);
		}
		System.out.println("변경하고자하는 생일을 입력해 주세요.(현재값:" + contact.getBirthday() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");
		String newBirthday = sc.nextLine();
		if (newBirthday != null && newBirthday.trim().length() > 0) {
			contact.setBirthday(newBirthday);
		}
		System.out.println("변경하고자하는 그룹을 입력해 주세요.(현재값:" + contact.getGroup() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");
		String newGroup = sc.nextLine();
		if (newGroup != null && newGroup.trim().length() > 0) {
			contact.setGroup(newGroup);
		}
//못함 
		if (contact instanceof CompanyContact) {
			CompanyContact companyContact = (CompanyContact) contact;
			System.out.println(
					"변경하고자하는 회사이름 입력해 주세요.(현재값:" + companyContact.getCompany() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");

			String company = sc.nextLine();

			if (company != null && company.trim().length() > 0) {
				companyContact.setCompany(company);
			}
			System.out.println(
					"변경하고자하는 부서이름을 입력해 주세요.(현재값:" + companyContact.getDivision() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");

			String division = sc.nextLine();

			if (division != null && division.trim().length() > 0) {
				companyContact.setCompany(division);
			}
			System.out.println(
					"변경하고자하는 직급을 입력해 주세요.(현재값:" + companyContact.getManager() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");

			String manager = sc.nextLine();

			if (manager != null && manager.trim().length() > 0) {
				companyContact.setPhoneNumber(manager);
			}

//못함 
		} else if (contact instanceof CustomerContact) {

			CustomerContact customerContact = (CustomerContact) contact;

			System.out.println(
					"변경하고자하는 거래처 이름을 입력해 주세요.(현재값:" + customerContact.getCompany() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");

			String company = sc.nextLine();

			if (company != null && company.trim().length() > 0) {
				customerContact.setCompany(company);
			}

			System.out.println(
					"변경하고자하는 거래품목을 입력해 주세요.(현재값:" + customerContact.getProduct() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");

			String product = sc.nextLine();

			if (product != null && product.trim().length() > 0) {
				customerContact.setProduct(product);
			}

			System.out.println(
					"변경하고자하는 담장자 이름을 입력해 주세요.(현재값:" + customerContact.getManager() + ")\n" + "변경하지 않으려면 엔터를 눌러주셍 >");

			String manager = sc.nextLine();

			if (manager != null && manager.trim().length() > 0) {
				customerContact.setManager(manager);
			}

		}

		System.out.println("정보가 수정되었습니다.");
		System.out.println();
	}

	// 삭제
	void deleteContact() {
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.print("삭제하고자 하는 이름을 입력해주세요 >");
		String name = sc.nextLine();// 사용자 입력
		// 삭제하고자 하는 index 찾아야 한다! -> 시프트
		int serchIndex = -1;// 현재 검색의 결과는 없다.
		// serchIndex가 0으로 되어있으면 0번 배열이 나오니깐 -1부터 시작한다
		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {// 배열에 총길이만큼 반복
			if (contacts[i].getName().equals(name)) {// 입력값이 contacts[i].getName()과 비교하여 같으면 true
				serchIndex = i;// -1이였던 값에 i 값 넣어줌
				break;// 탈출
			}
		}
		if (serchIndex < 0) {// serchIndex 값이 -1 그대로 이면 true반환
			System.out.println("삭제하고자 하는 이름의 데이터가 존재하지 않습니다.");
		} else {
			for (int i = serchIndex; i < numOfContact - 1; i++) {// 위에서 넣어준 배열부터 마지막배열까지 실행(배열은 0번부터 시작해서 -1해줌)
				contacts[i] = contacts[i + 1];// ?? 하나씩 다운시프트 해주는건데 contacts에 뭐가 들어있는지는 모르겠음(모름)
			}
			numOfContact--;// 총 배열길이 -1
			System.out.println("데이터가 삭제 되었습니다.");
		}
	}

	// 검색 후 결과 출력 ( 이름으로 검색 )
	public void searchInfoPrint() {
		// 1. 사용자에게 검색할 키워드 입력받는다!
		// 2. 배열에서 이름 검색을 하고있다면
		// 3. 결과를 출력한다 : "검색한 이름의 정보가 없습니다. "or 정보 출력

		String name = null;
		System.out.println("검색을 시작합니다.");
		System.out.print("검색할 이름을 입력해주세요. >");
		name = sc.nextLine();
		Contact contact = null;// 아래 null값과 비교하기 위해 미리 넣어줌
		// 배열에서 검색할 이름을 가지는 인스턴스의 데이터 출력 메소드를 실행
		for (int i = 0; i < numOfContact; i++) {// 배열 길이만큼 실행
			// 각 요소의 참조변수로 객체를 참조해서 이름을 비교
			if (contacts[i].getName().equals(name)) {// 입력값과 Contact[i].getName를 비교
				contact = contacts[i];// 값이 맞으면contact에 contacts[i] 주소 저장
				break;// 탈출
			}
		}
		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다."
		System.out.println("검색의 결과 ==================");
		if (contact == null) {// 값이 null이면 실행
			System.out.println("검색한 이름" + name + "의 정보가 없습니다. ");
		} else {
			contact.printInfo();// Contact[i].printInfo() 실행
		}
	}

	// 전체 입력 데이터의 출력
	void printAllDate() {

		System.out.println("전체 데이터를 출력합니다.===============");
		// 배열에 저장된 데이터를 모두 출력
		if (numOfContact == 0) {// 배열총길이 0이면 실행
			System.out.println("입력된 정보가 없습니다. ");
			return;
		}
		for (int i = 0; i < numOfContact; i++) {// 배열 길이만큼 반복
			contacts[i].printInfo();// Contact[i].printInfo()를 i반복만큼 순서대로 실행
		}
	}

	// 친구 정보입력
	public void insertContact() {
		// 배열에 인스턴스를 저장하고,
		// 1. 데이터 받고
		// 2. 인스턴스 생성
		// 3. 배열에 인스턴스의 참조값을 저장

		if (numOfContact == contacts.length) {// 배열 총길이와 현재 Contact[i] 개수를 비교
			System.out.println("최대 저장개수는 " + contacts + "개 입니다. ");
			return;

		}

		System.out.println("입력하고자 하는 친구 타입을 선택해 주세요.");
		System.out.println("1. 회사 동료 \t 2. 거래처");
		int select = Integer.parseInt(sc.nextLine());

		// Scanner sc = new Scanner(System.in); //위에서 스케너 선언하여 sc사용가능
		String name = null;// 값 초기화
		String phoneNumber = null;// 값 초기화
		String email = null;// 값 초기화
		String address = null;// 값 초기화
		String birthday = null;// 값 초기화
		String group = null;// 값 초기화
		System.out.println("입력을 시작합니다. ");
		System.out.print("이름 >");
		name = sc.nextLine();

		System.out.println("전화번호 >");
		phoneNumber = sc.nextLine();
		System.out.print("이메일 >");
		email = sc.nextLine();
		System.out.print("주소 >");
		address = sc.nextLine();
		System.out.print("생일 >");
		birthday = sc.nextLine();
		System.out.print("그룹 >");
		group = sc.nextLine();

		Contact contact = null;

		if (select == 1) {

			System.out.println("회사이름 >>");
			String company = sc.nextLine();
			System.out.println("부서이름 >>");
			String division = sc.nextLine();
			System.out.println("직급 >>");
			String manString = sc.nextLine();
			// CompanyContact 인스턴스 생성
			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, division,
					manString);

		} else {
			// CustomerContact 인스턴스 생성
			System.out.println("거래처 이름 >>");
			String company = sc.nextLine();
			System.out.println("거래 품목 >>");
			String product = sc.nextLine();
			System.out.println("담당자 >>");
			String manager = sc.nextLine();

			// 2. 인스턴스 생성
			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, product, manager);
		}
		// 분기 1. 회사 , 2. 거래처
		// 2. 인스턴스 생성
//		Contact contact = new Contact(name, phoneNumber, email, address, birthday, group);
		// 값 모두 받아서 new키워드로 인스턴스 생성함

		// 처음 입력 : numOfContact =>0
		contacts[numOfContact++] = contact;// 방금 입력한 Contact클래스 주소를 contacts[배열에 길이+1] 값에 저장함

	}

}
