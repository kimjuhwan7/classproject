package chapter02;

public class ValiableCatingOperator {

	public static void main(String[] args) {

		char c1 = 'a';
		int result = c1 + 10; // char+ int => int+int=> 결과 int
		// char이 자동형변환으로 int+10 계산됨
		System.out.println(result);

		int num1 = 10;
		float num2 = 10.0f;

		float result2 = num1 + num2;// int + float => float +float =>float
		System.out.println(result2);

		float num3 = 1.2f;
		double num4 = num3;// num3을 double타입으로 넣기 위해 num3이 double로 자동형변환됨
		System.out.println(num4);

		double result3 = (int)(num3*10 + num4*10)/10.0;
		System.out.println(result3);
	}

}
