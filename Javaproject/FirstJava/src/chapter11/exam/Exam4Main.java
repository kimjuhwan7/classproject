package chapter11.exam;

import java.util.HashMap;
import java.util.Map;

public class Exam4Main {
	public static void main(String[] args) {
		// 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는
		// Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.

		Map<Integer, FootballPlayerT> players = new HashMap<>();

		players.put(7, new FootballPlayerT("손흥민", 7, "토트넘", 20));
		players.put(7, new FootballPlayerT("손흥민", 7, "토트넘", 30));
		System.out.println(players.get(7));
		FootballPlayerT playerT = players.get(7);

	}

}
