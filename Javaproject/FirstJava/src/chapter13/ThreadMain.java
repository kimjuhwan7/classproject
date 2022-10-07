package chapter13;

public class ThreadMain {
	// 메인 스레드 실행 시점
	public static void main(String[] args) {
		// 새로운 일의 흐름을 생성 -> 스레드 생성
		MyThread thread1 = new MyThread();// new 상태

		// 쓰레드의 실행 : 흐름이 생성되고, run() 실행
		thread1.start();

		// Runnable 객체를 이용한 스레드 생성 실행
		Mythread2 t = new Mythread2();

		Thread thread2 = new Thread(t);
		
		thread2.start();
//쓰레드 실행은 2번 할 수 없다 start를 재실행 할 수 없다. 다시 만들어줘야 실행 가능함
//		thread2.start();
		try {
			thread1.join();//1 스래드가 종료 도힐때 까지 다른 스래드를 block 상태로 처리함
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}
