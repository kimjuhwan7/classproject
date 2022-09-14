package chapte03;

import java.time.*;

public class git_pairing_test {
	public static void main(String[] args) {

		LocalTime now = LocalTime.now();

		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();

		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.print(second + "초");
	}
}
