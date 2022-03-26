package loans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan2 {
	
	@BeforeTest
	public void cleanDBBeforeTest() {
		System.out.println("Clear db - testing BeforeTest");
	}
	
	@AfterTest
	public void cleanDBAfterTest() {
		System.out.println("Clear db - testing AfterTest");
	}
	
	@BeforeMethod
	public void cleanDBBeforeMethod() {
		System.out.println("Clear db - testing BeforeMethod");
	}
	
	@Test
	public void homeLoan3() {
		System.out.println("HomeLoan2 for homeLoan3");
	}

	@Test
	public void homeLoan4() {
		System.out.println("HomeLoan2 for homeLoan4");
	}
	
	@Test
	public void homeLoanFraudTest() {
		System.out.println("HomeLoan2 for homeLoanFraudTest");
	}
}
