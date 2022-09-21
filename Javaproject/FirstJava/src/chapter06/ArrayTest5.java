package chapter06;

public class ArrayTest5 {
	public static void main(String[] args) {
//2차원 배열의 초기화
		int[][] scores = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 }, { 41, 42, 43 } };
//0~3
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
