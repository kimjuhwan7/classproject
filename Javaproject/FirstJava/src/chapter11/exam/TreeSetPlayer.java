package chapter11.exam;

import java.util.TreeSet;

//1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
//
// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수
// 인
// 스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
//
// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로
// 저장하는 프로
// 그램을 만들어 봅시다.
//
// 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
public class TreeSetPlayer {

	public static void main(String[] args) {

		TreeSet<FootballPlayer> set = new TreeSet<>();
		set.add(new FootballPlayer("손흥민", 010 - 0000 - 0000, "팀", 30));
		set.add(new FootballPlayer("황희찬", 010 - 3333 - 3333, "2팀", 32));
		set.add(new FootballPlayer("이강인", 010 - 2222 - 2222, "2팀팀", 33));
		set.add(new FootballPlayer("손흥민", 010 - 0000 - 0000, "팀", 30));
		set.add(new FootballPlayer("조현우", 010 - 0000 - 0000, "3팀팀", 42));

		System.out.println("요소의 개수 : " + set.size() + "개 입니다.");
		for (FootballPlayer fp : set) {
			System.out.println(fp);
		}
	}
}
