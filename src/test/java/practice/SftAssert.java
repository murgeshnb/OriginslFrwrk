package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.GenericLibrary.Baseclass;

public class SftAssert extends Baseclass{
	
	@Test
	public void sample(){
		System.out.println("Step1");
		System.out.println("Step2");
		SoftAssert so=new SoftAssert();
		so.assertEquals("A", "B");
		System.out.println("Step3");
		so.assertEquals("X", "Y");
		System.out.println("Step4");
		so.assertAll();	
	}
	
	@Test
	public void sample2(){
		System.out.println("Step 11");
		System.out.println("Step 22");
	}

}
