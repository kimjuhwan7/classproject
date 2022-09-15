package chapte04;

public class DoWhileLoop {
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println(num);
			num++;
			// do 는 무조건 한번이상 실행한다.
			// while 조건을 do밑에 넣어준다.
		} while (num < 5);
	}
}
