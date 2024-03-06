package Aspire.Sportlink;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LastT {
	
	@BeforeTest
	public void money()
	{
		System.out.println("Hi11");
		System.out.println("How are you");
	}
	@AfterTest
	public void money2()
	{
		System.out.println("Hi22");
	}
}
