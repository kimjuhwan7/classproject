package ver02;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smartPhone = SmartPhone.getInstance();
		// 싱글톤이라 왜 new를 안쓰는지 궁금

		// 입력
		smartPhone.insertContact();
		System.out.println();

		// 이름 검색 후 결과 출력
		smartPhone.searchInfoPrint();
		System.out.println();
		// 친구 정보 입력
		smartPhone.insertContact();
		System.out.println();

		// 전체 출력
		smartPhone.printAllDate();
		System.out.println();

		// 수정
		smartPhone.deitContact();
		System.out.println();

		// 이름 검색 후 삭제
		smartPhone.deleteContact();
		System.out.println();

		//
//		// 이름 검색후 삭제
//		smartPhone.deleteContact();
//		System.out.println();
//		smartPhone.searchInfoPrint();
//		System.out.println();
//		smartPhone.printAllDate();
//		System.out.println();
//

	}
}
