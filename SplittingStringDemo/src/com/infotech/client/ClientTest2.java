package com.infotech.client;

public class ClientTest2 {

	public static void main(String[] args) {
		//If you have a date in dd/mm/yyyy format and you want to split it into day,
		//month and year.
		String date = "26/05/2018";
		String[] dateArr = date.split("/");
		System.out.println("" + dateArr.length);
		System.out.println("day " + dateArr[0] + " Month " + dateArr[1]
				+ " Year " + dateArr[2]);
	}
}
