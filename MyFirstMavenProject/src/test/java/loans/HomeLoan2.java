package loans;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan2 {
	
	@BeforeTest
	public void cleanDBBeforeTest() {
		System.out.println("Homeloan2: Clean the database before we start in HomeLoan2 - BeforeTest");
	}
	
	@AfterTest
	public void cleanDBAfterTest() {
		System.out.println("Homeloan2: Clean the database after we are done in HomeLoan2 - AfterTest");
	}
	
	@BeforeMethod
	public void checkSysHealthBefore() {
		System.out.println("Homeloan2: check the system health BEFORE EVERY TEST IN THIS HOMELOAN2 CLASS - Before Method");
	}
	
	@AfterMethod
	public void checkSysHealthAfter() {
		System.out.println("Homeloan2: check the system health AFTER EVERY TEST IN THIS HOMELOAN2 CLASS - After Method");
	}
	
	@Test(groups = {"Smoke"})
	public void homeLoan3() {
		System.out.println("HomeLoan2.3");
	}

	@Test(enabled=false)
	public void homeLoan4() {
		System.out.println("HomeLoan2.4");
	}
	
	@Test(enabled=true)
	public void homeLoanFraudTest() {
		System.out.println("HomeLoan2.Fraud");
	}
}
