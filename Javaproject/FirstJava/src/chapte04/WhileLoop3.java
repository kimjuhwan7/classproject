package chapte04;

public class WhileLoop3 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (num <= 10) {
			sum = sum + num;
			num++;

		}
		System.out.println("1~10 까지의 합 :" + sum);
	}
}
