package practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericLibrary.Baseclass;
import com.crm.GenericLibrary.ListImpClass;

@Listeners(com.crm.GenericLibrary.ListImpClass.class)
public class SampleListScript extends Baseclass {
	
	@Test
	public void comeon(){
		System.out.println("Test started am listening");
		System.out.println("Checking for asssertion");
		Assert.assertEquals(false,true);
		System.out.println("Test ends");
	}

}
