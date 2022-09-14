package chapte03;

public class CharTypeOperator {
	public static void main(String[] args) {
		char c1 = 'A';
		int codeNum = c1 + 1;
		// System.out.println(codeNum);
		// System.out.println(++c1);
		char j = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.println(j++);
		}
	}
}
