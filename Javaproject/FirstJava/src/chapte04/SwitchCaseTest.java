package chapte04;

public class SwitchCaseTest {
	public static void main(String[] args) {
		int key = 1;
		// switch case : 특정 값 하나를 비교해서 분기 하는 조건문
		// key 값과 case 다음에 오는 값을 비교해서 실행
		switch (key) {
		case 1:// 위에 key값이 1이면 라인 실행
			System.out.println("1의 결과 !!!!");
			break;

		case 2:
			System.out.println("2일 때 처리");
			break;
		default:// 위에 정의된 case 조건에 맞지 않는 나머지 (if else에 else랑 같음)
			System.out.println("1이 아닌 나머지");
			break;
		}
	}
}
