package chapter11.exam;

import java.util.TreeSet;

public class Exam3Main {

	// 3. TreeSet<E>을 이용해서
	// 팀 이름순으로 정렬하고,
	// 같은 팀의 선수들은 이름 순으로 정렬하고,
	// 같은 이름의 선수는 번호순으로 저장하는 프로그램을 만들어 봅시다.

	public static void main(String[] args) {

		TreeSet<FootballPlayerT> players = new TreeSet<>();
		players.add(new FootballPlayerT("손흥민", 7, " 토트넘", 20));
		players.add(new FootballPlayerT("케인", 10, " 토트넘", 25));
		players.add(new FootballPlayerT("이강인", 25, " 토트넘", 19));
		players.add(new FootballPlayerT("박지성", 7, "멘유", 35));
		players.add(new FootballPlayerT("루니", 10, "멘유", 35));
		players.add(new FootballPlayerT("손흥민", 7, " 토트넘", 20));
 
		System.out.println("보유 선수의 수 : " + players.size());
		System.out.println("보유 선수 리스트 ==========");
		for (FootballPlayerT p : players) {
			System.out.println(p);
		}
	}

}