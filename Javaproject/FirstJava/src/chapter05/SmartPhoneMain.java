package chapter05;

// 프로그램의 시작 포인트 
public class SmartPhoneMain {
	public static void main(String[] args) {
		// 참조변수 선언 : 인스턴스의 메모리 주소값을 저장
		SmartPhone sp = null;
		// 인스턴스 생성 : class에서 정의한 변수와 메소드를 사용할 수 있는 상태로 만드는 것
		// 인스턴스와 -> 변수와 메소드를 메모리에 로드한다!
		// SmartPhone()를 메모리에 올리고 sp변수로 주소값을 준다
		sp = new SmartPhone();// 인스턴스 메모리를 생성하고 주소값을 반환
		// 인스턴스 변수 참조 방법 : 참조변수.인스턴스변수이름
		System.out.println("스마트폰 제조사" + sp.company);
		System.out.println("스마트폰의 색상" + sp.color);
		System.out.println("스마트폰의 크기" + sp.size);
		System.out.println("스마트폰의 볼륨 크기" + sp.volumeSize);

		// 인스턴스 변수 할당
		sp.company = "Samsung";
		sp.color = "white";
		sp.size = 4.7f;
		sp.volumeSize = 10;
		System.out.println("");
		System.out.println("인스턴스의 변수의 값 할당 후 ======");
//		System.out.println("스마트폰 제조사" + sp.company);
//		System.out.println("스마트폰의 색상" + sp.color);
//		System.out.println("스마트폰의 크기" + sp.size);
//		System.out.println("스마트폰의 볼륨 크기" + sp.volumeSize);

		// 인스턴스의 메소드 호출 : 참조변수.메소드이름();
		sp.showInfo();

		sp.volumeUp();
		System.out.println("현재 볼륨 : " + sp.volumeSize);
		sp.volumeDown();
		sp.volumeDown();
		System.out.println("현재 볼륨 : " + sp.volumeSize);
	}
}
