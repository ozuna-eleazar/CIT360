package javaHttpUrlConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaHttpUrlConnect {

	public static void main(String[] args) throws Exception {
		new JavaHttpUrlConnect();
	}

	public JavaHttpUrlConnect() {
		try {
			String myUrl = "http://lynnpagelphotography.com/";

			String testing = UrlConnectionAction(myUrl);
			System.out.println(testing);
		} catch (Exception e) {

		}
	}

	private String UrlConnectionAction(String myUrl) throws Exception {
		URL url = null;
		BufferedReader reader = null;
		StringBuilder stringBuilder;

		try {
			// create the HttpURLConnection
			url = new URL(myUrl);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();

			// 15 seconds to respond
			connection.setReadTimeout(15 * 1000);
			connection.connect();

			// read the output from the server
			reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			stringBuilder = new StringBuilder();

			String line = null;
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line + "\n");
			}
			return stringBuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			// close the reader; this can throw an exception too, so
			// wrap it in another try/catch block.
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}

}
