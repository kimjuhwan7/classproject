package chapter02;

import java.util.Scanner;

public class Member {
//클래스 name은 가급적 같은 이름 사용 금지 비슷한 클래스면 병합이 맞음
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name = null;
		int age = 0;
		String nickName = null;
		double height = 0.0;
		boolean hasBook = false;// 기본값 false

		System.out.print("이름을 입력해 주세요>>>");
		name = in.nextLine();

		System.out.print("나이을 입력해 주세요>>>");
		age = in.nextInt();

		in.nextLine();
		System.out.print("별명을 입력해 주세요>>>");
		nickName = in.nextLine();

		System.out.print("키를 입력해 주세요>>>");
		height = in.nextDouble();

		in.nextLine();
		System.out.print("책 보유여부를 입력해 주세요>>>");
		hasBook = in.nextBoolean();

//		name = "김주환";
//		age = 22;
//		height = 186;
//		hasBook = true;
		String YesNo = "";

		if (hasBook == true) {
			YesNo = "있습니다.";
		} else {
			YesNo = "없습니다.";
		}
		System.out.println("저의 이름은 " + name + " 입니다.");
		System.out.println("저의 나이는 " + age + " 입니다.");
		System.out.println("저의 별명은 " + nickName + " 입니다.");
		System.out.println("저의 키는 " + height + " 입니다.");
		System.out.println("저는 책이 " + YesNo);

	}

}
