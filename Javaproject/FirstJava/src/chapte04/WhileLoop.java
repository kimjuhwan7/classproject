package chapte04;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 0;
		while (num < 1000000) {
			System.out.print("JAVA"+num);
			num+=11;
			// num이 5보다 작은동안 실행된다
			// num++ == num+=1 == num+1
		}
	}

}
