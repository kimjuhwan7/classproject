package chapter06;

import java.util.Iterator;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 배열 : 많은 수의 변수를 다루어야할 때 사용
		// 일괄 처리 !!!
		// 변수 여러개를 순차적으로 만든것과 같은 효과를 가진다.
		// 메모리를 옆에 붙여서 순차적으로 생성
		// 배열변수 => 타입[ ] 변수이름
		// 다른방식 => 타입 변수이름[ ]
		// 배열생성하는 것은 : 메모리공간 생성, 변수들을 생성
		// new 타입[개수] => [ ]안에 입력한 숫자만큼의 메모리공간(변수)을 생성

		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];

		// 배열의 사이즈를 가지고 있는 length
		System.out.println("배열의 요소 개수 :" + korScore.length);

		// 배열의 참조 방법 : 변수이름[index]
		// index 0부터 배열요소개수 -1
//index=> 0~9 까지 공간을 가짐

//		for (int i = 0; i < korScore.length; i++) {
//			System.out.println(korScore[i]);
//		}

		korScore[0] = 55;
		korScore[1] = 64;
		korScore[2] = 85;
		korScore[3] = 43;
		korScore[4] = 15;
		korScore[5] = 94;
		korScore[6] = 12;
		korScore[7] = 71;
		korScore[8] = 45;
		korScore[9] = 90;
		for (int i = 0; i < korScore.length; i++) {
//			System.out.println(i + ":" + korScore[i]);
		}
		int sum = 0;
		for (int i = 0; i < korScore.length; i++) {
			sum += korScore[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("반 평균 : " + sum / korScore.length + "점 입니다.");
	}
}
