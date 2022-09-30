package chapter11.exam;

import java.util.LinkedList;
import java.util.List;

//1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
//
//2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인
//스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
//
//3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로
//그램을 만들어 봅시다.
//
//4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다. 

public class FootballPlayer {
	public FootballPlayer(String string, int i, String string2, int j) {
		// TODO Auto-generated constructor stub
	}
 
	public static void main(String[] args) {
		String name;
		int number;
		String team;
		int age; 

		LinkedList<String> player = new LinkedList<>();
		player.add("축");
		player.add("구");
		player.add("선");
		player.add("수");

		printAll(player);
	}

	static <E> void printAll(LinkedList<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}
}
