package chapter09.exam;
//코드 오류
import java.util.Scanner;

public class Exam3Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >>");
		String name = sc.nextLine();
//if(name.trim().length()==0){}
		if (name.trim().isEmpty()) {
			System.out.println("공백은 허용하지 않습니다.");
		} else {
			if (checkName(name)) {
				System.out.println(name);
			} else {
				System.out.println("이름은 영문자 대소문자만 입력이 가능합니다.");
			}
		}
	}

	static boolean checkName(String name) {
		boolean result = true;
		// 문자열의 각 문자를 비교해서 원하는 문자 타입이 아닐때 탈출 결과값은 false출력
		// charAt(i)
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c > 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
				result = true;
				break;
			}
		}

		return false;
	}
}
