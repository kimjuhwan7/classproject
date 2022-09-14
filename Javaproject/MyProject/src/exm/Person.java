package exm;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ma = '-';
		String User_Name = "";
		String User_Num;
		String User_Person_Num;
		System.out.println("회원이름을 입력하세요");
		User_Name = sc.nextLine();
		System.out.println("회원 전화번호를 입력하세요!");
		User_Num = sc.nextLine();
		System.out.println("회원 주민번호를 입력해주세요->");

		User_Person_Num = sc.nextLine();
		String User_Person_New = User_Num.substring(0, 3) + ma + User_Num.substring(3, 7) + ma
				+ User_Num.substring(7, 11);
		String User_Person_Num2 = User_Person_Num.substring(0, 6) + ma + User_Person_Num.substring(6, 13);
		System.out.println("회원명 : " + User_Name + "\n회원번 : " + User_Person_New + "\n회원주 : " + User_Person_Num2);
	}
}