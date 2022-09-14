package chapte03;

public class CastingOperator {
	public static void main(String[] args) {
		byte num1 = 120;
		byte num2 = 120;
		// 기본형 / 참조형
		// 기본형
		// 숫자 문자 논리값
		// 정수 실수 문자 논리값
		// byte short int long float double, char, boolean
		byte result = (byte) (num1 + num2);
		//연산시 int 변환되어 result에 넣을 수 없으니깐 강제적으로 byte로 만들어준다
		System.out.println(result);
		
	}
}
