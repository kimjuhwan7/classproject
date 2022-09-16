package chapte04;

import java.util.Iterator;

public class ForLoopTest2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(" ");
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " Ⅹ " + i + " = " + i * j + "\t");
			}

		}
	}
}
