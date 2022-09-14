package first;

import java.util.Scanner;//스케너클래스

public class Student {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner 객체 생성

		String nam;
		int rnr;
		int dud;
		int tn;
		int sum = 0;
		int[] i_array = new int[9];

		for (int i = 0; i < i_array.length; i++) {// arr.length길이만큼 작동
			i_array[i] = in.nextInt();
		}

		for (int j = 0; j < i_array.length; j++) {
			sum += i_array[j];
		}
		System.out.println("수학점수 합" + sum);
		System.out.println("수학점수 평균" + (double) sum / 10);
	}

}
