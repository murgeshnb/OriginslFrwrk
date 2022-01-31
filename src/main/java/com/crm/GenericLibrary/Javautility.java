package com.crm.GenericLibrary;

import java.util.Date;
import java.util.Random;

public class Javautility {
	/**
	 * this method will generate a random number and returns it to the caller
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran=new Random();
		int random = ran.nextInt(1000);
		return random;
	}
	
	/**
	 * this method will returns the currentdate to the caller
	 * @return
	 */
	
	public String getCurrentDate()
	{
		Date d=new Date();
		String currentdate = d.toString();
		return currentdate;
	}
	
	/**
	 * This method will return date in specified format
	 * @return
	 */
	public String getFinalDateFormat()
	{
		Date d=new Date();
		String date = d.toString();
		String[] dte = date.split(" ");
		String YYYY = dte[5];
		String DD = dte[2];
		String MM = dte[1];
		
		String today = YYYY+"-"+MM+"-"+DD;
		return today;
		
	}

	}
