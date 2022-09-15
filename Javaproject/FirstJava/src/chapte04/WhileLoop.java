package chapte04;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 0;
		while (num < 5) {
			System.out.println(num);
			num++;
			// num이 5보다 작은동안 실행된다
			// num++ == num+=1 == num+1
		}
	}

}
