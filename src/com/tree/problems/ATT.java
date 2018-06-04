package com.tree.problems;




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ATT {

	//"input":[ "1", "4", "5" ]
	public static void main(String[] args) throws Exception {

		if(args== null || args.length!=1) return;

		try {
			URL url = new URL(args[0]);
			String inputJson = readUrl(url);
			parseInput(inputJson);
		} catch (final MalformedURLException malformedURLException) {
			System.out.println("Not a valid URL");
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	} 


	private static String readUrl(URL url) throws Exception {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			final StringBuffer buffer = new StringBuffer();
			int read;
			final char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			return buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}

	private static void parseInput(  String json) {
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse(json);
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		Gson parser = new Gson();
		int totalSum = 0;

		for ( Map.Entry<String, JsonElement> entries : jsonObject.entrySet()) {
			String key = entries.getKey();
			System.out.println("Key : " + key);
			if (key.equalsIgnoreCase("numbers")) {
				int[] numbers = parser.fromJson(entries.getValue(), int[].class);
				int numberSum = 0;
				for (int number : numbers) {
					numberSum += number;
				}
				System.out.println("Sum: " + numberSum);
				totalSum += numberSum;
			}
		}
		System.out.println("Total: " + totalSum);
	}

}
