package com.crm.GenericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyzerclass implements IRetryAnalyzer{
	int counter=0;
	int retrylimit=1;
	public boolean retry(ITestResult result) {
		
		if(counter<retrylimit){
			counter++;
			return true;	
		}
	return false;
}
	
	

}
