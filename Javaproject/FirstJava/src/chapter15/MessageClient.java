package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MessageClient {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 7777);

		DataInputStream din = new DataInputStream(socket.getInputStream());// 보낼때 사용
		DataOutputStream dout = new DataOutputStream(socket.getOutputStream());// 가져온 값
		String str1 = "";
		String str2 = "";

		Scanner sc = new Scanner(System.in);
		int as = 0;
		while (true) {
			System.out.print(" ");
			str1 = sc.nextLine();
			if (str1.equals("exit")) {
				System.out.println("브레이크");
				break;
			}
			dout.writeUTF(str1);

			dout.flush();

			str2 = din.readUTF();
			System.out.println("Server message : " + str2);
		}
		dout.close();
		socket.close();

	}
}