package com.infotech.client;

public class ClientTest3 {

	public static void main(String[] args) {
		//Suppose you just want the day part of the date then you can use the split()
		//method which also passes limit as argument
		String date = "26/05/2018";
		String[] dateArr = date.split("/", 2);
		System.out.println("" + dateArr.length);
		System.out.println("day " + dateArr[0]);
	}
}
