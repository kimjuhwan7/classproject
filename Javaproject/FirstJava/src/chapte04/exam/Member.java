package chapte04.exam;

import java.util.Calendar;
import java.util.Scanner;
import java.text.*;

public class Member {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		flu(age);

		System.out.println("생년월일을 입력하세요");
		int SimpleDateFormat = sc.nextInt();
		birthday(SimpleDateFormat);
	}

	public static int flu(int age) {
		if (age > 15 && age < 65) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
		return age;
		// TODO Auto-generated method stub

	}

	public static int birthday(int SimpleDateFormat) {
		
		return SimpleDateFormat;
		// 날짜가 String으로 들어와서 사용자가 입력한 값이랑 비교가 안됨
		// Date.getTime() 사용해서 숫자비교 후 남은 날짜 구해서 보여주기
		// https://coding-factory.tistory.com/737
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