package chapter13;

// 스레드 클래스 정의 : thread 클래스를 상속해서 run() 메소드를 오버라이딩
public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			
//			try {
//				Thread.sleep(500);
				System.out.println("새로운 스레드가 생성되어 시작합니다.");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			

		}
	}
}
