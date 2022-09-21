package chapter06;

import java.util.Iterator;

public class ArrayTest4 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		// arr은 (요소개수가 4개인 1차원 배열) 3개를 가지는 배열 인스턴스를 가르킨다!
		// 1차원 배열의 사이즈는 4

		System.out.println("첫번째 1차원 배열의 사이즈 :" + arr[0].length);
		System.out.println("두번째 1차원 배열의 사이즈 :" + arr[1].length);

		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 21;
		arr[1][0] = 22;
		arr[1][1] = 22;
		arr[1][2] = 22;

		for (int i = 0; i < arr.length; i++) {
 			for (int j = 0; j <= arr.length; j++) {
				System.out.print("arr[" + i + "][" + j + "] =" + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
