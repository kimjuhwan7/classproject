package chapte04;

public class SwitchCaseTest3 {
	public static void main(String[] args) {
		String grade = "admin";// String은 문자열을 다루는 변수를 가지고있다
//grade.equals("admin")은 grade 문자열과 admin 문자열을 비교할때 사용한다.
		if (grade.equals("admin")) {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else if (grade.equals("manager")) {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
		} else if (grade.equals("manager")) {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
		} else if (grade.equals("manager")) {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
		} else {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
		}

//admin manager  member

		switch (grade) {
		case "admin":
			System.out.println("지표보기 기능 가능");
		case "manager":
			System.out.println("회원승인 기능 가능");
		case "member":
			System.out.println("쓰기 기능 가능");
		default:
			break;
		}

		/*
		 * int score = 70;
		 * 
		 * switch (score / 10) { case 10: System.out.println("A"); break; case 9:
		 * System.out.println("A"); break; case 8: System.out.println("B"); break; 모든
		 * case 조건에 부합하지 않아 그래도 switch문을 빠져나온다 }
		 */}

}
