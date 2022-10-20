package dept;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Commend commend = new Commend();
//		Controller controller = new Controller();

		while (true) {
			menu();
			System.out.println("메뉴를 입력하세요. >>");
			int select = Integer.parseInt(sc.nextLine());
			commend.commend.get(select).process();
		}

	}

	public static void menu() {
		System.out.println("부서관리 프로그램");
		System.out.println("1. 전체 부서리스트");
		System.out.println("2. 부서 검색");
		System.out.println("3. 부서 정보 저장");
		System.out.println("4. 부서 정보 수정");
		System.out.println("5. 부서 정보 삭제");
		System.out.println("6. 종료");

	}
}
