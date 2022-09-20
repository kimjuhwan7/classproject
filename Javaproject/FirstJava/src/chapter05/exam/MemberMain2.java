package chapter05.exam;

public class MemberMain2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("son", "010-1111-1111", "축구", 1, "son@gmail.com", 20010101, "런던");
		m1.showMomberInfo();
		Member2 m2 = new Member2("son", "010-1111-1111", "축구", 1, "son@gmail.com");
		m2.showMomberInfo();
	}
}
