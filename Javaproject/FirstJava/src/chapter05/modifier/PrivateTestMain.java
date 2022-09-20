package chapter05.modifier;

public class PrivateTestMain {
	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		pt.shoInfo();
	}
}
/*
 * System.out.println(pt.name); System.out.println(pt.age); pt.age=300;
 * 
 * System.out.println(pt.age);
 */