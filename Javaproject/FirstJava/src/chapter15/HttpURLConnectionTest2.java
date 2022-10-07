package chapter15;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionTest2 {
	public static void main(String[] args) {

		String urlStr = "www.google.co.kr";

		URL url;
		try {

			url = new URL(urlStr);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			for (int i = 0; i <= 8; i++) {

				System.out.println(connection.getHeaderFieldKey(i) + "=" + connection.getHeaderField(i));

			}
			connection.disconnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
