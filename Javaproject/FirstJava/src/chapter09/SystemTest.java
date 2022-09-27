package chapter09;

public class SystemTest {
	public static void main(String[] args) {
		// 작업시간 체크 : 성능 검사
		// 1970.01.01. 00:00:00 000 현재 시간까지의 밀리초 결과값
		long startTime = System.currentTimeMillis();
		long sTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			for (int j = 0; j < 999999999; j++) {

				int n1 = 1;
				int n2 = 10;
				int sum = n1 + n2;
				int asfjlk = 34124292;
				int asf4jlk = 34124292;
				int asfj241lk = 34124292;
				int asfjl1k = 34124292;
				int asfjl24k = 34124292;
				long aa = 242465 * 2466323;
				long a4a = 242465 * 2466323;
				long a42a = 242465 * 2466323;
				long a4442a = 242465 * 2466323;
				long a4242a = 242465 * 2466323;
				long a462a = 242465 * 2466323;
				long a427a = 242465 * 2466323;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sTime);
		System.out.println("실행 시간은 : " + ((long) endTime - (long) startTime));
	}
}
