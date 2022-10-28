package mini;

import java.util.Random;
import java.util.Scanner;

public class Hi99 extends Thread {

	static int x;// 앞자리
	static int y;// 뒷자리
	static int z;// 사용자입력값
	static int answer;// 앞*뒤=결과값
	static int count_down = 0;// 카운트 다운
	static int score;// 총점
	static int plus = 10;// 추가점수

	@Override
	public void run() {
System.out.println("김");
		for (int start_count = 5; start_count < count_down; start_count--) {
			try {
				Thread.sleep(1000);
				System.out.print(start_count);
				if (count_down == start_count) {
					System.out.println("시간 초과");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("구구단 게임을 시작합니다." + 5 + "초 안에 입력해주세요");
		while (true) {
			Hi99 thread = new Hi99();

			x = random.nextInt(9) + 1;
			y = random.nextInt(9) + 1;
			answer = x * y;

			System.out.print(x + "x" + y + "=>");

			thread.start();// 5초 타이머

			z = sc.nextInt();// 사용자 입력

			if (z == answer) {
				score += 10;
				System.out.println("정답입니다! " + plus + "점 추가 " + " 총점 =>" + score);
				continue;
			} else if (z != answer) {
				System.out.println("오답입니다! 정답은 : " + answer + "입니다");

			}
			if (thread.isAlive()) {

				thread.interrupt();

			}
		}
	}

}
