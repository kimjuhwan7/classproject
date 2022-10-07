package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MessageClient {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 7777);

		DataInputStream din = new DataInputStream(socket.getInputStream());
		DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
		String str1 = "";
		String str2 = "";

		Scanner sc = new Scanner(System.in);
		int as = 0;
		while (true) {

			System.out.print(as += 1);
			System.out.println("입력");
			str1 = sc.nextLine();
			if (str1.equals("exit")) {
				System.out.println("브레이크");
				break;
			}
			dout.writeUTF(str1);

			dout.flush();

			str2 = (String) din.readUTF();
			System.out.println("Server message : " + str2);
		}
		dout.close();
		socket.close();

	}
}