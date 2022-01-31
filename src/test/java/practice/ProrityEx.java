package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProrityEx {
	
	@Test(invocationCount=3)
	private void hi(){
		Reporter.log("Doosra", true);
	}
	
	@Test(dependsOnMethods="hi")
	private void bye(){
		//Assert.fail();
		Reporter.log("Gang",true);
		
	}
	
	@Test(dependsOnMethods="bye",priority=-1, invocationCount=2)
	public void tata()
	{
		Reporter.log("tata",true);
	}

}
