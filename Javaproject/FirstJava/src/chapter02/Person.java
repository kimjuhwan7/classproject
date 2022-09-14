package chapter02;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String memberName = null;
		// ① 회원이름을 저장하는 변수
		String phoneNumber = null;
		// ② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수

		String personNumber = null;
		// ③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수

		System.out.println("회원이름을 입력하세요");
		memberName = sc.nextLine();
		System.out.println("회원 전화번호를 입력하세요!");
		phoneNumber = sc.nextLine();
		System.out.println("회원 주민번호를 입력해주세요->");
		personNumber = sc.nextLine();

	}
}
