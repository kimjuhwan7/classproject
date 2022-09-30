package ver03;

public class SmartPhoneMain2 {
	public static void main(String[] args) {
		SmartPhone sp = SmartPhone.getInstance();

		while (true) {
			printMeun();
			int select = Integer.parseInt(sp.sc.nextLine());// 문자열을 받아서 인트타입에 정수로 변환해주는 코드!

			switch (select) {
			case 1:
				sp.insertContact();
				break;
			case 2:
				sp.searchInfoPrint();
				break;
			case 3:
				sp.deitContact();
				break;
			case 4:
				sp.deleteContact();
				break;
			case 5:
				sp.printAllDate();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	static void printMeun() {
		System.out.println("====================");
		System.out.println("# 전화번호부");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전체 리스트 보기");
		System.out.println("6. 종료");
		System.out.println("====================");
		System.out.println("원하시는 메뉴 번호를 입력해주세요.");

	}
	// 전화번호부
	// 클래스3개
	// 1. 정보를 저장하느 ㄴ용도 클래스 : 인스턴스 마다 각각 다른 속성을 가진다.
	// 2. 기능을 처리하는 클래스 : 기능만 정의 -> 하나의 인스턴스만 생성 사용
	// 3. 프로그램을 정의하는 클래스
}
