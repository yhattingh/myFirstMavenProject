package loans;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class HomeLoan1 {
	
	@BeforeClass
	public void checkLogFileBefore() {
		System.out.println("HomeLoan1 - Check logfile BEFORE CLASS");
	}
	
	@AfterClass
	public void checkLogFileAfter() {
		System.out.println("HomeLoan1 - Check logfile AFTER CLASS");
	}
	
	@Test
	@Parameters("URL")
	public void myParameters(String URL) {
		System.out.println("HomeLoan1 - testing parameters");
		System.out.println("HomeLoan1 - This is the URL parameter " + URL);
	}
	
	@Test(groups = {"Regression"})
	public void skippedTest() {
		throw new SkipException("this is the skippedTest method");
	}
	
	@Test(groups = {"Regression"}) //force the test to fail
	public void failedTest() {
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"Smoke"})
	public void homeLoan1() {
		System.out.println("HomeLoan1.1");
	}

	@Test(groups = {"Regression"})
	public void homeLoan2() {
		System.out.println("HomeLoan1.2");
	}
}
