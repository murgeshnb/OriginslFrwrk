package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericLibrary.Baseclass;

public class RetryanalyyzerScript extends Baseclass {
	
	@Test(retryAnalyzer=com.crm.GenericLibrary.Retryanalyzerclass.class)
	public void samplemethod()
	{
		Assert.assertEquals("A", "B");
	}

}
