package chapter13;

public class Mythread2 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
//			try {
//				Thread.sleep(500);
				System.out.println("Runnable 인터페이스를 이용하여 run 메소드 실행");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}// 현재 스레드의 실행 상태를 block 상태로 변경


		}
	}
}
