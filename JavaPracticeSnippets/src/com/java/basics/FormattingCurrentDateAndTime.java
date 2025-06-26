package com.java.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingCurrentDateAndTime {

	public static void main(String[] args)
	{
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter formatterString = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss a");
		String formattedCurrentDate = currentDate.format(formatterString);
		System.out.println("Today's Date = " + formattedCurrentDate);
	}

}
