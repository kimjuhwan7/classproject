package chapter11.exam;

import java.util.HashSet;
import java.util.Set;

public class Exam2Main {
	public static void main(String[] args) {
		// 2.축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고
		// 입력이 되지 않도록 Set<E> 컬렉션을 이용해서
		// 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

		// Set<E> : 중복 허용 안함, 저장 순서도 유지하지 않음
		// 중복검사 : hashCode 코드로 검사 -> equals 를 통해 중복 검사

		Set<FootballPlayerT> players = new HashSet<>();

		players.add(new FootballPlayerT("손흥민", 7, " 토트넘", 20));
		players.add(new FootballPlayerT("케인", 10, " 토트넘", 25));
		players.add(new FootballPlayerT("이강인", 25, " 토트넘", 19));
		players.add(new FootballPlayerT("박지성", 7, "멘유", 35));
		players.add(new FootballPlayerT("루니", 10, "멘유", 35));
		players.add(new FootballPlayerT("손흥민", 17, " 토트넘", 20));
 
		System.out.println("보유 선수의 수 : " + players.size());
		System.out.println("보유 선수 리스트 ==========");
		for (FootballPlayerT p : players) {
			System.out.println(p);
		}
	}
}
