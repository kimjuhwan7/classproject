package chapte04.exam;

import java.util.Iterator;

public class Exam06 {
	public static void main(String[] args) {
		int num = 0;

		int sum = 0;
		while (num < 100) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println("for문을 이용한 1~99 까지의 합 : " + sum);
		sum = 0;
		num = 0;
		do {
			sum += num;

			num++;
		} while (num < 100);
		System.out.println("do while문을 이용한 1~99 까지의 합 " + sum);
	}
}
