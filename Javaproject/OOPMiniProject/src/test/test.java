package test;

public class test {

	void solution(int n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 5;
		//7명이 1조각씩 먹으면 1판
		//15명이 2조각씩 먹으면 2판 +1판     15/7 <=1 나머지가 1이상이면 
		
		
		System.out.println(15%7+"테스트");
		if (n%7 <=1) {
			System.out.println(n/7 +1);
			System.out.println("추가 ㅇ");
		} else {
			System.out.println(n % 7);
			System.out.println("추가 ㄴ");

		}
//System.out.println(1/7);
	}
}
