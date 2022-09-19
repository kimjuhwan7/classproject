package chapter05.exam;

public class MemberMain {
	public static void main(String[] args) {
		Member mb = new Member("김주환", 01000000000, "소프트웨어", 3, "juhwan7@gmail.com", "20010204", "서울특별시 강동구 천호동");
		Member mb2 = new Member("김주환", 01000000000, "소프트웨어", 3, "juhwan7@gmail.com");

		mb.member_Print();
		System.out.println("--------------------------");
		mb2.member_Print();
	}
}
