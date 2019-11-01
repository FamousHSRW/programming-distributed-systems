package com.hsrw.programming_distributed_systems;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a url to read a file from: ");
		String url = "";
		try {
			url = scanner.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("reading from " + url + " ...");
		try {
			URL urlReader = new URL(url.trim());
			InputStream urlStream = urlReader.openStream();
			String text = new BufferedReader(new InputStreamReader(urlStream)).readLine();

			while(text != null) {
				System.out.println("Url text: " + text);
				text = new BufferedReader(new InputStreamReader(urlStream)).readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();

	}

}
