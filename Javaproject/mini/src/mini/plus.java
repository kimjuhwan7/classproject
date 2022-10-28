package mini;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class plus extends Thread {
	static int x;// 앞자리
	static int y;// 뒷자리
	static int z;// 사용자입력값
	static int answer;// 앞*뒤=결과값
	static int num;
	static int score;// 총점
	static int plus = 10;// 추가점수
	static int count = 2;// 제한시간

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Timer timer = new Timer();

		System.out.println("구구단 게임을 시작합니다." + count + "초 안에 입력해주세요");

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				x = random.nextInt(9) + 1;
				y = random.nextInt(9) + 1;
				answer = x * y;//
//				if (count > 0) {
//					System.out.println("카운트 다운" + count);
//					count--;
//				} else if (count == 0) {
//					cancel();
//					System.out.println("시간초과");
//				}
				for (int i = 0; i < count; i++) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("for탈출");

				System.out.print(x + "x" + y + "=>");

				// z = sc.nextInt();
				if (z == answer) {
					score += 10;
					System.out.println("정답입니다! " + plus + "점 추가 " + " 총점 =>" + score);
				}

//				else {
//					System.out.println("오답입니다! 정답은 " + answer + " 입니다");
//					System.out.println("게임 종료");
//					break;
//				}
			}

		};

	}

}