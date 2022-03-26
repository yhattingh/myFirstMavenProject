package loans;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeLoan1 {
	
	@BeforeClass
	public void BeforeClassTest() {
		System.out.println("Clear db - testing BeforeClass");
	}
	
	@Test
	public void homeLoan1() {
		System.out.println("HomeLoan1 for homeLoan1");
	}

	@Test
	public void homeLoan2() {
		System.out.println("HomeLoan1 for homeLoan2");
	}
}
