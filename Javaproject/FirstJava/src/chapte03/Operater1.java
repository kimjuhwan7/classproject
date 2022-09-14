package chapte03;

public class Operater1 {
	public static void main(String[] args) {
		// 대입연산자 : = => 오른쪽에서 왼쪽으로 연산이 진행
		// 순서는 가장 마지막
		int num1 = 10;
		num1 = 10 + 20;
		// 10+20 연산이 우선시 되어 연산 후 num1 으로 들어간다
		boolean check = num1 - 27 > 5;
		// 비교 연산의 결과는 논리값 true false

		// 단항연산자 : 오른쪽에서 왼쪽으로 연산
		int num = 0;
		System.out.println(num);
		++num;
		// num = num + 1; 와 같은 뜻임
		System.out.println(num);
		++num;// num = num + 1;j num = 0 + 1 ; num = 1;
		System.out.println(num);
		num++;// num = num + 1;j num = 0 + 1 ; num = 2;
		System.out.println(num);
		--num;// num = num - 1;j num = 0 - 1 ; num = 1;
		System.out.println(num);
		num--;// num = num - 1;j num = 0 - 1 ; num = 0;
		System.out.println(num);
//부호 연산자
		// +, -
		int num2 = 1;
		System.out.println("num2 : " + num2);
		num2 = +num2;
		System.out.println("num2 : " + num2);

		num2 = -num2;
		System.out.println("num2 : " + num2);
		// 논리 부정 연산자 : ! => 논리값을 부정
		boolean btn = false;
		// btn에 false 값을 줌 (기본 false)
		System.out.println("btn : " + btn);
		btn = !btn;
		// btn값을 !사용하여 true로 바꿈
		System.out.println("btn : " + btn);
	}
}
