package chapter06;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] korScore = new int[10];

		korScore[0] = 55;
		korScore[1] = 64;
		korScore[2] = 85;
		korScore[3] = 43;
		korScore[4] = 15;
		korScore[5] = 94;
		korScore[6] = 12;
		korScore[7] = 71;
		korScore[8] = 45;
		korScore[9] = 90;
		sum(korScore);

	}

	public static void sum(int[] arr) {
		//매개변수에 arr = > korScores 의 배열인스턴스 주소

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("반 평균 : " + sum / arr.length + "점 입니다.");
	}
}
