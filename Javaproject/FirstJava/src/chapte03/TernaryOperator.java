package chapte03;

public class TernaryOperator {
	public static void main(String[] args) {
		int age = 55;// 회원에 나이
		boolean chk = false;// 성인판별

		// chk= 상태값(논리값: 조건식)?
		chk = age > 19 ? true : false;
		System.out.println("성인 판별값: " + chk);
		String msg = age > 19 ? "성인입니다." : "미성년입니다.";
		System.out.println(msg);

		// 크기가 큰 수 찾기
		int num1 = 242;
		int num2 = 52;
// 큰수 : 같은 수는 없다
		int maxnum = num1 > num2 ? num1 : num2;
		System.out.println("큰수 : " + maxnum);
//작은수 찾기 
		int minnum = num1 > num2 ? num2 : num1;
		System.out.println("작은수 : " + minnum);

		// 홀수 짝수 판별 : 나머지 값으로 비교
		// boolean result = boolean num1 %= 2 ? "짝수" : "홀수";
		// 조건식 값을 1과 0 으로 나오게 했을 때 왜 true false로 연산이 안되는거죠?
		// int refg = num1 %= 2;
		// System.out.println(refg);

		String result = num2 % 2 == 1 ? "홀수 입니다. " : "짝수 입니다.";
		System.out.println("num1의 값은 " + result);
		int num3 = -10;
		String msg1 = num3 > 0 ? "양수 입니다. " : num3 == 0 ? "0입니다." : "음수 입니다.";
		System.out.println("변수 num3은 " + msg1);

		int resultNum = num3 > 0 ? num3 : num3 == 0 ? 0 : -num3;
		System.out.println("num3의 절대값은 " + resultNum);

	}
}
