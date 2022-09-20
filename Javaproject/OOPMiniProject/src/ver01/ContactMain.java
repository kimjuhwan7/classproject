package ver01;

import java.util.Scanner;

public class ContactMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;// 이름
		int phonenumber;// 전화번호
		String email;// 이메일
		String address;// 주소
		int birthday;// 생일
		String group;// 그룹
		while (true) {
			System.out.print("이름을 입력해 주세요-->");
			name = sc.nextLine();
			System.out.print("전화번호를 입력해 주세요-->");
			phonenumber = sc.nextInt();
			sc.nextLine();
			System.out.print("이메일을 입력해 주세요-->");
			email = sc.nextLine();
			System.out.print("주소를 입력해 주세요-->");
			address = sc.nextLine();
			System.out.print("생일을 입력해 주세요-->");
			birthday = sc.nextInt();
			sc.nextLine();
			System.out.print("그룹을 입력해 주세요-->");
			group = sc.nextLine();

			Contact con = new Contact(name, phonenumber, email, address, birthday, group);

			con.showContactInfo();
		}
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