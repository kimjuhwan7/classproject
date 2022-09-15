package chapte03.exam;

public class Sample extends Thread {
	int seq;

	public Sample(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq + " thread start."); // 쓰레드 시작
		try {
			Thread.sleep(100); // 1초 대기한다.
		} catch (Exception e) {
		}
		System.out.println(this.seq + " thread end."); // 쓰레드 종료
	}

	public static void main(String[] args) {
		for (int i = 0; i < 50000; i++) { // 총 10개의 쓰레드를 생성하여 실행한다.
			Thread t = new Sample(i);
			t.start();
		}
		System.out.println("main end."); // main 메소드 종료
	}
}
