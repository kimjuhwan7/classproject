package chapter06;

public class ArrayTest6 {
	public static void main(String[] args) {
		// 참조형 변수를 다루는 배열 : 객체를 저장하는
		String[] names = new String[3];

		names[0] = "박지성";
		names[1] = "손흥민";
		names[2] = "이강인";
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names[0].length());
		System.out.println(names[1].equals("손흥민"));
		// length() 문자열에 있는 문자에 개수를 구해줌
		//String은 문자를 저장하는게 아니고 문자가 저장된 주소값을 저장한다
	}
}
