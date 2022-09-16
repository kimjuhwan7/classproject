package chapte04;

public class IfelseIfTest {
	public static void main(String[] args) {
		int score = 84;
		String result = "";
		if (score >= 90) {
			result = "A";
			if (score >= 97) {
				result += "+";
			} else if (score >= 93) {
				result += "-";
			}
		} else if (score >= 80) {
			result = "B";
			if (score >= 87) {
				result += "+";
			} else if (score >= 83) {
				result += "-";
			}
		} else if (score >= 70) {
			result = "C";
			if (score >= 77) {
				result += "+";
			} else if (score >= 73) {
				result += "-";
			}
		} else if (score >= 60) {
			result = "D";
			if (score >= 67) {
				result += "+";
			} else if (score >= 63) {
				result += "-";
			}
		} else if (score >= 50) {
			result = "F";
			if (score >= 57) {
				result += "+";
			} else if (score >= 53) {
				result += "-";
			}
		} else {
			result = "재수강 하세요^^";
		}
		System.out.println("학점 : " + result);
	}
}
