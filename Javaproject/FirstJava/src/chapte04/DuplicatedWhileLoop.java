package chapte04;

public class DuplicatedWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			int j = 2;
			i++;
			System.out.println();
			while (j < 10) {

				System.out.print(j + "Ⅹ" + i + "=" + i * j + "\t");
				j++;
			}
		}
	}
}
//내가 만듦