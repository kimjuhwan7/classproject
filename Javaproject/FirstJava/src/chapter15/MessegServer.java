package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessegServer {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();

		System.out.println("클라이언트가 접속했습니다.");
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		Scanner sc = new Scanner(System.in);

		// 전송 문자열
		String str1 = "", str2 = "";
		// 수신 문자열

		while (!str1.equals("exit")) {
			str1 = din.readUTF();
			System.out.println("Client message " + str1);
			str2 = sc.nextLine();
			dout.writeUTF(str2);
			dout.flush();

		}
		din.close();
		s.close();
		ss.close();

	}
}
