package chapte03;

public class RelationlOperator3 {
	public static void main(String[] args) {
		// 관계연산자(비교연산자)
		// > < >= <= == !=

		// 관계연산도 자료형을 일치 시켜놓고 연산이 이루어진다.
		char c = 'A';
		int num = 10;
		int codeNum = c + num;
		System.out.println("A(65)+10=" + codeNum);

		System.out.println(c > num);
		System.out.println('1' > '0');
		System.out.println(num == 10f);
		// int 10이 float로 변환 float==float

	}
}
