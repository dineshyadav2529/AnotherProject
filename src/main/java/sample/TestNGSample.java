package sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
	
	@Test (priority = 1, groups = {"high", "medium"})
	public void tc001(){
		System.out.println("test case 001, high, medium");
	}
	
	@Test (groups = "low")
	public void tc002(){
		System.out.println("test case 002, low");
	}
	
	@Test (enabled = true, groups = "high")
	public void tc003(){
		System.out.println("test case 003, high");
	}

	@BeforeMethod (alwaysRun = true)
	public void tc004(){
		System.out.println("test case 004");
	}
	
	@AfterMethod (alwaysRun = true)
	public void tc005(){
		System.out.println("test case 005");
	}
	
}
