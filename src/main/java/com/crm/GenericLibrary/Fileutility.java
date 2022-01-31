package com.crm.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	
	/**
	 * it is used to read the data from commondata.properties file based on keys which you pass as an arguments
	 * @param key
	 * @return
	 * @throws IOException
	 */

	public String getPropertyKeyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		Properties po=new Properties();
		po.load(fis);
		String value = po.getProperty(key);
		return value;
	}
}
