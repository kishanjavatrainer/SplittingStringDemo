package com.infotech.client;

public class ClientTest1 {

	public static void main(String[] args) {
		//If you have a string where one (or more) spaces are used and you want
		//to split it around those spaces.
		String str = "split this   string";
		String[] strArray = str.split("\\s+");
		System.out.println("" + strArray.length);
		for (String word : strArray) {
			System.out.println("words - " + word);
		}
	}
}