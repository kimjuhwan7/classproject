package chapter11.exam;

import java.util.ArrayList;
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

public class FootballPlayer implements Comparable<FootballPlayer> {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getTeam() {
		return team;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer) obj;
			result = name.equals(player.getName());
		}
		return result;
	}
 
	public static void main(String[] args) {


		ArrayList<String> player = new ArrayList<>();
		player.add("축");
		player.add("구");
		player.add("선");
		player.add("수");

		printAll(player);
	}

	static <E> void printAll(ArrayList<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	@Override
	public int compareTo(FootballPlayer o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
