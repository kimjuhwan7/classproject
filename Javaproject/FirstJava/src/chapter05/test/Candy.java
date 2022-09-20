package chapter05.test;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Candy {
	static int width = 100;// 넓이
	static int height = 100;// 높이
	String type;// 맛

	Candy(String type) {
		this.type = type;

	}

	public static void main(String[] args) {
		Scanner sc = null;
		Data data = null;

//		 인스턴스 8개 생성시 -> 변수 24개 생성
		// 인스턴스 8개 생성시 ->변수8+2개 생성(변수 선언시 static 사용하여 변수를 메모리에 저장해놔서 재활용함
		Candy c1 = new Candy("허브1");
		Candy c2 = new Candy("허브2");
		Candy c3 = new Candy("허브3");
		Candy c4 = new Candy("허브4");
		Candy c5 = new Candy("허브5");
		Candy c6 = new Candy("허브6");
		Candy c7 = new Candy("허브7");
		Candy c8 = new Candy("허브8");
	}
}
