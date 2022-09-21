package ver01;

import java.util.Scanner;

public class ContactMain2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Contact 인스턴스 생성 : 생성자를 이용한 데이터 초기화
//		Contact2 c1 = new Contact2("손흥민", "010-9999-1111", "con@gmail.com", "런던", "1999-10-12", "친구");
//		System.out.println("이름 : " + c1.getName());
//		System.out.println("전화번호 : " + c1.getPhoneNumber());
//		System.out.println("이메일 : " + c1.getEmail());
//		System.out.println("주소 : " + c1.getAddress());
//		System.out.println("생일 : " + c1.getBirthday());
//		System.out.println("그룹 : " + c1.getGroup());
//		System.out.println();
//		c1.printInfo();
//
//		c1.setName("박지성");
//		c1.setPhoneNumber("010-3333-5555");
//		System.out.println();
//		//c1.printInfo();

		while (true) {

			System.out.println("1입력시작 | 0. 종료");
			String select = in.nextLine();

			// 사용자 요청에 따라 프로그램 종료/진행 = >분기처리함
			if (select.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;// 메시지 출력후 빠져나가기
			} else if (!select.equals("1")) {
				System.out.println("올바른 요청이 아닙니다.1");
				continue;// 메시지 출력하고 넘어가기
			}
			System.out.println("데이터 입력을 시작합니다.");

			System.out.println("이름 >>>");
			String name = in.nextLine();

			System.out.println("전화번호 >>>");
			String phoneNumber = in.nextLine();

			System.out.println("이메일 >>>");
			String email = in.nextLine();

			System.out.println("주소 >>>");
			String address = in.nextLine();

			System.out.println("생일 >>>");
			String birthday = in.nextLine();

			System.out.println("그룹 >>>");
			String group = in.nextLine();

			Contact2 c = new Contact2(name, phoneNumber, email, address, birthday, group);
			c.printInfo();
		}
	}
}
