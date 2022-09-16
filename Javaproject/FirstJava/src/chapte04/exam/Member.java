package chapte04.exam;

import java.util.Scanner;//10번 라인에 Scanner를 사용하기 위해서 사용됨

public class Member {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in); // sc라는 이름으로 사용자에 입력을 받 스캐너를 가져옴
		int age = sc.nextInt();// 사용자에 입력을 int로 받아서 age 변수에 넣음
		flu(age);// 19번라인 메소드로 이동함

		System.out.println("생년을 입력하세요");
		int SimpleDateFormat = sc.nextInt();// 사용자에 입력을 int로 받아서 SimpleDateFormat 변수에 넣음
		birthday(SimpleDateFormat);// 사용자에게서 입력받아 SimpleDateFormat변수에 넣은 값을 29번 줄 메소드로 넘겨줌
	}

	public static int flu(int age) {// fle메소드는 int age라는 메소드 하나를 가지고 있음
		if (age > 15 && age < 65) {// int age가 15이상이면서 65이하인 사람을 걸러줌
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
		return age;

	}

	public static int birthday(int SimpleDateFormat) {// int SimpleDateFormat라는 매개변수를 가지고 있음
		int day = 2022;// day변수에 int 2022값을 넣어줌
		if (day - SimpleDateFormat < 20) {// 이번년도 - 태어난년도 차를 구해서 20보다 작으면 아래코드 실행
			System.out.println(day - SimpleDateFormat);// 올해년도 - 입력년도 값구해서 사용자에게 보여줌
			System.out.println("미성년자 입니다.");
		} else {// 31번줄 if 값이 false면 34번줄 else문이 실행됨
			if (SimpleDateFormat % 2 == day % 2) {// 입력년도를 2로나눈 나머지를 구하고, 올해를 2로나눈 나머지를 구해서 서로 같은지 비교함
				System.out.println(SimpleDateFormat + " 내년에 무료건강검진이 가능합니다.");// 입력년도랑 올해년도가 둘다 짝수면 실행
			} else {// 35번줄 값이 false면 37번 줄 실행
				System.out.println(SimpleDateFormat + " 올해 무료건강검진이 가능합니다.");// 사용자가 입력한 값 표출 + 내용
			}
			if (day - SimpleDateFormat >= 40) {// 올해 - 사용자입력년도가 40보다 크거나 같으면 41번 라인 실행 됨
				System.out.println("연세 " + (day - SimpleDateFormat) + "세 암 검사도 무료로 가능합니다.");
			}

		}
		return SimpleDateFormat;
	}
}
//독감접종 가능한 여부확인메소드
//15~65 무료예방접종이 가능합니다. 콘솔 메시지																	
//15~65 이외 나머지 무료접종 대상이 아닙니다. 출력

//건강검진 대상 여부 판별해서 검진 가능한지 확인
//매개변수로 태어난 해 받고
//20세 경우 2년마다 무료건강검진
//올해가 짝수년도면 짝수년도 사람들 무료
//올해가 홀수년도면 홀수년도 사람들 무료
//40이상일때는 암 검사도 무료